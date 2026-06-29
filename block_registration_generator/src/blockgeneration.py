from src.data.block import gen as genBlock
from src.data.wall import gen as genWall
from src.data.fence import gen as genFence
from src.data.slab import gen as genSlab
from src.data.stairs import gen as genStairs
from src.data.pillar import gen as genPillar
from src.data.carpet import gen as genCarpet
from src.data.pressure_plate import gen as genPressurePlate

from src.filemanager import openDataTemplate
from src.filemanager import getDataFolders
from src.filemanager import delete_folder_content
from src.gentag import gentag,addtag


from src.dataFilesHandler import replaceKeysInString,registerFiles

def generate_blocks(blocks, templates, config):
    [javaRegistry] = templates

    minecraft_version = config["minecraft_version"]
    javaRegistry = javaRegistry.get(minecraft_version)

    registries: list = []
    tabRegistries: list = []

    folders = getDataFolders(config)

    [delete_folder_content(folders[f]) for f in [
        "blockstates",
        "items",
        "models"
    ]]

    for key in blocks.keys():

        name: str = key
        blockInfo = blocks[name]
        blockData = blockInfo.copy()

        blockData["name"] = name
        blockData["texture"] = blockInfo.get("texture", name).replace("infested_", "")

        if not blockData["copies"] in blocks.keys():
            blockData["copies"] = f"minecraft:{blockInfo['copies']}"

        blockType: str = blockInfo.get("type", "block")
        copies: str = blockInfo.get("copies")

        addtag(f"block/mineable/{blockData["tool"]}",name)

        # --- THE FIX: Using nonlocal lets us read/write variables from the loop scope ---
        def gen(builder):
            nonlocal blockType
            template = openDataTemplate(blockType, minecraft_version)
            builder(blockData, config)

        # Determine the copy block formatting cleanly without separate function side-effects
        if copies in blocks.keys():
            copyBlock = copies.upper()
        else:
            copyBlock = f"Blocks.{copies.upper()}"

        # commonReplace setup
        commonReplace = [
            ("name", name),
            ("all_caps", name.upper()),
            ("copies", copyBlock)
        ]

        def registerBlock(blockClass):
            blockTemplate = javaRegistry.get("block_registry")
            registries.append(replaceKeysInString(blockTemplate, [
                *commonReplace,
                ("type", blockClass)
            ]))
            tabTemplate = javaRegistry.get("tab_registry")
            if not tabTemplate: 
                print("couldn't get tab registry template ")
                return

            tabTemplate = tabTemplate.replace("$all_caps", name.upper())
            tabRegistries.append(tabTemplate)

        def registerStairs():
            stairTemplate = javaRegistry.get("stairs_registry")

            default:str
            if copies in blocks.keys():
                default = copies.upper()
            else:
                default = f"Blocks.{copies.upper()}" 

            registries.append(replaceKeysInString(stairTemplate, [
                ("default", default),
                *commonReplace
            ]))

        # Matching block types
        match blockType:
            case "block":
                gen(genBlock)
                registerBlock("Block")
            case "pillar":
                gen(genPillar)
                registerBlock("Block")
            case "wall":
                gen(genWall)
                registerBlock("WallBlock")
            case "fence":
                gen(genFence)
                registerBlock("FenceBlock")
            case "stairs":
                gen(genStairs)
                registerStairs()
            case "slab":
                gen(genSlab)
                registerBlock("SlabBlock")
            case "carpet":
                gen(genCarpet)
                registerBlock("CarpetBlock")
            case "pressure_plate":
                gen(genPressurePlate)
            case _: 
                continue



    regString = "".join(registries)
    tabString = "".join(tabRegistries)

    gentag(config)
    registerFiles(config)

    return [regString, tabString]

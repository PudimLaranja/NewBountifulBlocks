from src.pathmanager import convertToPath
import tomllib as toml
import json

from src.globals import PROJECT_PATH, MOD_SOURCE

templateFiles = [
    "javaRegistry"
]

def openFiles():

    configFilePath = PROJECT_PATH / "generator_config.toml"

    files = []

    blocksFiles = []

    with open(configFilePath) as file:
        configFile = toml.load(file.buffer)

        if not file: return print("couldn't find config file")
        # print("config file read sucesfully")

        blocksFiles = configFile.get("blocks_config")

        files.append(configFile)
    
    blocks = {}
    if blocksFiles:
        for file in blocksFiles:
            path = (PROJECT_PATH / convertToPath(file+".toml")).resolve()
            if path.is_file():
                with open(path) as file:
                    blocksFile = toml.load(file.buffer)

                    if not blocksFile: return print("could not find blocks file in %s".format(path))
                    
                    for key in blocksFile.keys():
                        blocks[key] = blocksFile.get(key)
        print("block configuration files read sucesfully")
        # print(blocks)
    files.append(blocks)

    templates = []

    for path in templateFiles:
        with open((PROJECT_PATH / "src" / "templates" / (path+".toml")).resolve()) as file:
            templateFile = toml.load(file.buffer) 

            if not templateFile: return print("could not open template file: %s".format(path))

            templates.append(templateFile)

    print("all template files read sucesfully")
    # print(templates)

    files.append(templates)



    return files

def openDataTemplate(blockType,version) -> dict:
    path = PROJECT_PATH / "src" / "templates" / "data" / version / f"{blockType}.json"

    if not path.is_file: return

    with open(path) as file:
        return json.load(file.buffer)

def getDataFolders(config):

    namespace = config["namespace"]
    resources = MOD_SOURCE / "main" / "resources"

    assets = resources / "assets" / namespace
    data = resources / "data" / "minecraft"

    langFolder = assets / "lang"

    result = {
        "blockstates" : assets / "blockstates",
        "items" : assets / "items",
        "models": assets / "models" / "block",
        "tags" : data / "tags",
        "lang" : {
            "en_us": langFolder / "en_us.json",
        }
    }
 

    return result

def delete_folder_content(folder):
    for filePath in folder.rglob("*"):
        if filePath.is_file():
            with open(filePath) as file:
                try:
                    obj = json.load(file.buffer)
                    #only deletes generated files
                    if obj.get("generated") == True:
                        filePath.unlink(missing_ok=True)
                except:
                    pass
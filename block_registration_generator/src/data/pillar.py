from src.dataFilesHandler import searchAndReplace

def gen(block,config):


    name = block.get("name")

    namespace = config["namespace"]

    model = block.get("model",name)
    texture = block.get("texture", name).split(":")

    is_vannila_texture = texture[0] == "minecraft"

    texture = texture[-1]

    copies = block.get("copies").split(":")

    copies_vannila_block = copies[0] == "minecraft"

    copies = copies[-1]


    def selectNamespace(key,_):
        if key == "side" and is_vannila_texture or key == "end" and copies_vannila_block:
            return "minecraft"
        else:
            return namespace

    searchAndReplace("pillar",name,config,[
        ("namespace",selectNamespace),
        ("model", model),
        ("texture_side", texture),
        ("texture_end", copies)
    ])

    
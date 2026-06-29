from src.dataFilesHandler import searchAndReplace

def gen(block,config):


    name = block.get("name")
    copies = block.get("copies")

    namespace = config["namespace"]

    model = block.get("model",name)
    texture = block.get("texture", copies).split(":")

    is_vannila_texture = texture[0] == "minecraft"

    texture = texture[-1]

    searchAndReplace("carpet",name,config,[
        ("namespace",lambda key,_: "minecraft" if key == "wool" and is_vannila_texture else namespace),
        ("model", model),
        ("texture", texture)
    ])

    
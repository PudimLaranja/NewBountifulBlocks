from src.dataFilesHandler import searchAndReplace

def gen(block,config):


    name = block.get("name")

    namespace = config["namespace"]

    model = block.get("model",name)
    texture = block.get("texture", name).split(":")

    is_vannila_texture = texture[0] == "minecraft"

    texture = texture[-1]

    searchAndReplace("pressure_plate",name,config,[
        ("namespace",lambda key,_: "minecraft" if key == "texture" and is_vannila_texture else namespace),
        ("model", model),
        ("texture", texture)
    ])

    
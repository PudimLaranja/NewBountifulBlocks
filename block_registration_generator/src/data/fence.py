from src.gentag import addtag
from src.dataFilesHandler import searchAndReplace


def gen(block,config):

    name:str = block.get("name")

    addtag("block/fences",name)

    namespace = config["namespace"]

    model = block.get("model",name)

    if block.get("texture") == name: block["texture"] = None

    texture = block.get("texture") or block.get("copies")

    is_vannila_texture = False


    if texture:
        if ":" in texture:
            parts = texture.split(":")
            is_vannila_texture = (parts[0] == "minecraft")
            texture = parts[-1]
        else:
            is_vannila_texture = False
    else:
        texture = name
    
    searchAndReplace("fence",name,config,[
        ("namespace",lambda key,_: "minecraft" if key == "texture" and is_vannila_texture else namespace),
        ("texture",texture),
        ("model", model)
    ])



    

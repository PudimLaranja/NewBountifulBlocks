from src.gentag import addtag
from src.dataFilesHandler import searchAndReplace


def gen(block:dict,config):

    name:str = block.get("name")

    addtag("block/walls",name)

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
    
    searchAndReplace("wall",name,config,[
        ("namespace",lambda key,_: "minecraft" if key == "wall" and is_vannila_texture else namespace),
        ("model",model),
        ("texture",texture)
    ])

    
    

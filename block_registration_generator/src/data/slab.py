from src.gentag import addtag
from src.dataFilesHandler import searchAndReplace

def gen(block:dict,config):
    name:str = block.get("name")

    addtag("block/slabs",name)

    namespace = config["namespace"]

    model = block.get("model",name).split(":")[-1]

    if block.get("texture") == name: block["texture"] = None

    texture = block.get("texture") or block.get("copies")

    if name == "dripstone_slab":    print(texture)

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

    copies = block.get("copies").split(":")[-1]

    def texture_namespace(key:str,string:str):
        
        if name == "dripstone_slab":    print(key)

        ret = ""

        if (
            key in ["bottom","side","top",] and is_vannila_texture or
            key == "model" and "$copies" in string and is_vannila_texture
        ):
            return "minecraft"
        else :
            return namespace
    
    if name == "dripstone_slab":    print(texture,is_vannila_texture)
    
    searchAndReplace("slab",name,config,[
        ("namespace", texture_namespace),
        ("model",model),
        ["texture",texture],
        ("copies",copies)
    ])

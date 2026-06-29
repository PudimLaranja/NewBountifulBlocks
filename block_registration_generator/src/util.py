import json

def json_format(obj):
    return json.dumps(obj,indent=4,sort_keys=4)

def json_print(obj):
    print(json_format(obj))

def replace_multiple(obj:str,replace_list:list):
    for rep in replace_list:
        obj = obj.replace(f"${rep[0]}",rep[1]) 
    return obj
from src.globals import RESOURCES_PATH,PROJECT_PATH
from src.util import json_format

import json

class FileRegistry:
    name: str
    path: list = []
    content: dict = {}

    def __init__(self, name: str, path: list, content: dict):
        # Removed trailing comma to prevent self.name from becoming a tuple
        self.name = name
        self.path = path
        self.content = content
    
    def register(self,config):

        path = RESOURCES_PATH / "assets" / config.get("namespace")

        for folder in self.path:
            path /= folder
        
        # Created target directory if it doesn't exist
        path.mkdir(parents=True, exist_ok=True)
        
        #mark file as generated
        self.content["generated"] = True

        # Ensure name is treated as a string during path joining
        with open(path / f"{self.name}.json", "w") as file:
            # Fixed sort_keys=True capitalization
            file.write(json.dumps(self.content, indent=4, sort_keys=True))
        
    def __str__(self) -> str:
        return f"""
        name = {self.name}
        path = {self.path} 
        content = {json.dumps(self.content, indent=2)}
        """


def replaceKeysInString(string: str, replaceArray: list,key:str = "") -> str:
    for pair in replaceArray:

        if string.find(pair[0]) >= 0:

            value:str = ""

            if callable(pair[1]):
                value = pair[1](key,string)
            else:
                value = pair[1]



            string = string.replace("$"+pair[0], value)

    return string


# Global list to track results
registryList = []


def searchAndReplace(blockType: str, blockName: str,config: dict = {}, replaceArray: list = [] ):
    global registryList

    file_path = PROJECT_PATH / "src" / "templates" / "data" / "26.1.2" / f"{blockType}.json"
    
    with open(file_path, "r") as file:
        content = json.load(file)
        # We catch the returned updated dictionary here
        recursive(content, blockName, replaceArray)
    
def registerFiles(config):
    for file in registryList:
        file.register(config)

def recursive(currentSearch: dict | list, blockName: str, replaceArray: list, currentDepth: int = 0, currentPath: list = []):
    global registryList
    
    if currentDepth > 10: 
        return currentSearch

    match currentSearch:
        case dict():
            new_dict = {}
            for key, element in currentSearch.items():
                # Replace placeholders inside the KEY itself
                new_key = replaceKeysInString(key, replaceArray)
                
                if isinstance(element, (dict, list)):
                    nextPath = []
                    if currentPath is not None:
                        nextPath = currentPath.copy()
                        
                    if key.startswith("_") or key.endswith("*"): 
                        nextBlockName = blockName
                        if key.startswith("_") and len(key) > 1:
                            nextBlockName = blockName + key

                        if key.endswith("*") and currentPath is not None:
                            nextPath.append(new_key.replace("*", ""))                    
                        
                        # Process inner element and add to file registry
                        inner_content = recursive(element, blockName, replaceArray, currentDepth + 1, None)
                        registryList.append(FileRegistry(nextBlockName, nextPath, inner_content))
                    elif currentPath is not None:
                        nextPath.append(new_key)
                        inner_content = recursive(element, blockName, replaceArray, currentDepth + 1, nextPath)
                    else:
                        inner_content = recursive(element, blockName, replaceArray, currentDepth + 1, None)
                    
                    new_dict[new_key] = inner_content
                    
                elif isinstance(element, str):
                    new_dict[new_key] = replaceKeysInString(element, replaceArray,key)
                else:
                    new_dict[new_key] = element
            return new_dict

        case list():
            new_list = []
            for element in currentSearch:
                if isinstance(element, (dict, list)):
                    new_list.append(recursive(element, blockName, replaceArray, currentDepth + 1, None))
                elif isinstance(element, str):
                    new_list.append(replaceKeysInString(element, replaceArray))
                else:
                    new_list.append(element)
            return new_list

    return currentSearch


def test():
    # Example run setup
    searchAndReplace("wall", "test", [
        ("namespace", "bountiful"),
        ("model", "testModel"),
        ("texture", "testTexture")
    ])

    for reg in registryList:
        print(reg)
from ntpath import isfile
from pathlib import Path
from textwrap import indent
import tomllib as toml
import json
import copy  # <-- 1. Import the copy module

from src.filemanager import getDataFolders, delete_folder_content, openDataTemplate
from src.util import json_print

tags:dict[str,list[str]] = {
    
}

def addtag(tagName: str, block: str):
    global tags
    tags.setdefault(tagName,[])
    tags[tagName].append(block)
def gentag(config):
    global tags
    tags_folder: Path = getDataFolders(config)["tags"]
    delete_folder_content(tags_folder)

    tag_template: dict = openDataTemplate("tag", config.get("minecraft_version"))


    for path in tags.keys():
        blocks = tags[path]
        template = copy.deepcopy(tag_template)
        path = tags_folder / Path(path+".json")


        block_with_namespace = []

        for name in blocks:
            block_with_namespace.append(f"{config["namespace"]}:{name}")

        template["values"] = block_with_namespace

        print(path)

        with open(path,"w") as file: 
            file.write(json.dumps(template,indent=4))

















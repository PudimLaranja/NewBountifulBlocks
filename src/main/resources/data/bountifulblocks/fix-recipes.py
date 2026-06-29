
from pathlib import Path
from pprint import pprint
import json
from textwrap import indent

p = Path("./recipe/").glob("**/*.json")

recipes = [x for x in p if x.is_file()]

for file_path in recipes:
    recipe:dict = {}
    with open(file_path,"r") as file:
        recipe = json.load(file.buffer)

        if recipe.get("key") != None:
            for key in recipe["key"].keys():
                if isinstance(recipe["key"][key],str):  continue
                recipe["key"][key] = recipe["key"][key]["item"]

        if recipe.get("ingredient") != None:
            if isinstance(recipe["ingredient"],str):  continue
            recipe["ingredient"] = recipe["ingredient"]["item"]

        if recipe.get("ingredients") != None:
            for i in range(len(recipe["ingredients"])):
                if isinstance(recipe["ingredients"][i],str):  continue
                recipe["ingredients"][i] = recipe["ingredients"][i]["item"]

    with open(file_path,"w") as file:
        file.write(
            json.dumps(recipe,indent=4)
        )



from pathlib import Path
from src.globals import PROJECT_PATH
import json

def convertToPath(components="",separator = "/"):
    path = Path()

    if type(components) is list:
        for component in components:
            path = path / component
    elif type(components) is str:
        for component in components.strip().split(separator):
            path = path / component
    print(path)
    return path


def getDataTemplete(blockType):
    path = PROJECT_PATH / "src" / "data" / blockType

    if not path.is_file: return

    with open(path) as file:
        return json.load(file.buffer)


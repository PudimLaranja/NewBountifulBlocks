
import tomllib as toml
from pathlib import Path 
from src.filemanager import openFiles
from src.pathmanager import convertToPath
from src.injectcode import inject
from src.blockgeneration import generate_blocks
from src.globals import MOD_SOURCE, PROJECT_PATH


registryClass = ""


def generate():
    files = openFiles()
    if not files: return print("Could not open files")

    [config,blocks,templates] = files

    package = ""
    classPath = ""

    package = config.get("package_name")
    classPath = config.get("block_registry_class")

    if not package: return print("variable 'package_name' needs to be set in the generator_config.toml file")
    if not classPath: return print("variable 'block_registry_class' needs to be set in the generator_config.toml file")

    [env,classPath] = classPath.split(":")
    classPath = classPath.split(".")
    classPath[-1] += ".java"
    
    registryClass = MOD_SOURCE / env / "java" / convertToPath(package,".") / convertToPath(classPath)

    registries = generate_blocks(blocks,templates, config)


    if not registryClass.is_file: return print("registry class is not a java file")

    # with open("output",'w') as file:
    #     file.write(registriesStr)

    inject(registryClass,registries)


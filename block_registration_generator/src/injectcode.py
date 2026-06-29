
registration = {
    "start": "//$blockRegistration:start",
    "end": "//$blockRegistration:end"
}

tab = {
    "start": "//$tabRegistration:start",
    "end": "//$tabRegistration:end"
}

def inject(filePath,content):
    [blockRegistry,tabRegistry] = content

    injectTag(filePath,blockRegistry,registration)
    injectTag(filePath,tabRegistry,tab)

def injectTag(filePath,content,tag):
    original_content = ""

    if not filePath.is_file: return print("file path to registry class doesnt correspond to a file")

    with open(filePath, "r", encoding='utf-8') as file:
        original_content = file.read()
    
    if tag["start"] not in original_content or tag["end"] not in original_content:
        return print("tags not found in file")
    
    print("tags found in file")

    position_start = original_content.find(tag["start"]) + len(tag["start"])
    position_end = original_content.find(tag["end"])

    part_before = original_content[:position_start]
    part_after = original_content[position_end:]

    final_content = f"{part_before}\n{content}\n{part_after}"

    with open(filePath, 'w', encoding='utf-8') as file:
        file.write(final_content)

    print("file sucessfully updated")

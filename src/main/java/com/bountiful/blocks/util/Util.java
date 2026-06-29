package com.bountiful.blocks.util;

import net.minecraft.resources.Identifier;

public class Util {
    static Identifier idFrom(String namespace, String path) {
        return Identifier.fromNamespaceAndPath(namespace, path);
    }
}

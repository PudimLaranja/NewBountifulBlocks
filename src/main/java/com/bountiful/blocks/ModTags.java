package com.bountiful.blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.rmi.registry.Registry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NETHER_PORTAL_FRAMES = createTag("nether_portal_frames");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, NewBountifulBlocks.id(name));
        }
    }
}

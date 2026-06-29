package com.bountiful.blocks;

import com.bountiful.blocks.blocks.ModBlockTypes;
import com.bountiful.blocks.blocks.ModBlocks;
import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


public class NewBountifulBlocks implements ModInitializer {
    public static final String MOD_ID = "bountifulblocks";

    public static final Map<Block,Block> CARVABLE_PLANKS = ImmutableMap.<Block,Block>builder()
            .put(Blocks.OAK_PLANKS, ModBlocks.CARVED_OAK_PLANKS)
            .put(Blocks.SPRUCE_PLANKS, ModBlocks.CARVED_SPRUCE_PLANKS)
            .put(Blocks.BIRCH_PLANKS, ModBlocks.CARVED_BIRCH_PLANKS)
            .put(Blocks.JUNGLE_PLANKS, ModBlocks.CARVED_JUNGLE_PLANKS)
            .put(Blocks.ACACIA_PLANKS, ModBlocks.CARVED_ACACIA_PLANKS)
            .put(Blocks.DARK_OAK_PLANKS, ModBlocks.CARVED_DARK_OAK_PLANKS)
            .put(Blocks.CHERRY_PLANKS, ModBlocks.CARVED_CHERRY_PLANKS)
            .put(Blocks.MANGROVE_PLANKS, ModBlocks.CARVED_MANGROVE_PLANKS)
            .put(Blocks.BAMBOO_PLANKS, ModBlocks.CARVED_BAMBOO_PLANKS)
            .put(Blocks.CRIMSON_PLANKS, ModBlocks.CARVED_CRIMSON_PLANKS)
            .put(Blocks.WARPED_PLANKS, ModBlocks.CARVED_WARPED_PLANKS)
            .build();

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.init();
        ModBlockTypes.register();


        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_SPRUCE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_JUNGLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_ACACIA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_DARK_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_MANGROVE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_CHERRY_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_BAMBOO_PLANKS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_CRIMSON_PLANKS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CARVED_WARPED_PLANKS, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_FLOORING, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_FLOORING, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_FLOORING, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_FLOORING, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_FLOORING_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_FLOORING_STAIRS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_FLOORING_STAIRS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_FLOORING_STAIRS, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_FLOORING_STAIRS, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_FLOORING_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_FLOORING_SLAB, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_FLOORING_SLAB, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CRIMSON_FLOORING_SLAB, 5, 20);
        //FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WARPED_FLOORING_SLAB, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_THREADED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_THREADED_WOOL, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_THREADED_CARPET, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_THREADED_CARPET, 30, 60);


        LOGGER.info("Hello Fabric world!");
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

}
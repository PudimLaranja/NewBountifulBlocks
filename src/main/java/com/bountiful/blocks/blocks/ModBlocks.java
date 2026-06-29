package com.bountiful.blocks.blocks;

import com.bountiful.blocks.NewBountifulBlocks;
import com.bountiful.blocks.blocks.custum.CarvedSnowBlock;
import com.bountiful.blocks.blocks.custum.LargeChainBlock;
import com.bountiful.blocks.blocks.custum.MudButtonBlock;
import com.bountiful.blocks.blocks.custum.MudPressurePlateBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.List;
import java.util.function.Function;

public class ModBlocks {

    public static final Block SMOOTH_MUD_PRESSURE_PLATE = register(
            "smooth_mud_pressure_plate",
            (settings) -> new MudPressurePlateBlock(ModBlockTypes.MUD,settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)
                    .forceSolidOn()
                    .strength(0.5f)
                    .pushReaction(PushReaction.DESTROY),
            true
    );

    public static final Block SMOOTH_MUD_BUTTON = register(
            "smooth_mud_button",
            MudButtonBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD),
            true
    );

    public static final Block CARVED_SNOW = register(
            "carved_snow",
            CarvedSnowBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK),
            true
    );

    public static final Block LARGE_CHAIN = register(
            "large_chain",
            LargeChainBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_CHAIN),
            true
    );

    public static final Block GLAZED_TERRACOTTA = register(
            "glazed_terracotta",
            GlazedTerracottaBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA),
            true
    );

    //$blockRegistration:start
    public static final Block STONE_WALL = register(
            "stone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
            true
    );
    public static final Block CHISELED_SMOOTH_STONE = register(
            "chiseled_smooth_stone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE),
            true
    );
    public static final Block SMOOTH_STONE_STAIRS = register(
            "smooth_stone_stairs",
            (settings) -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE),
            true
    );
    public static final Block SMOOTH_STONE_WALL = register(
            "smooth_stone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE),
            true
    );
    public static final Block SMOOTH_STONE_BRICKS = register(
            "smooth_stone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE),
            true
    );
    public static final Block SMOOTH_STONE_BRICK_STAIRS = register(
            "smooth_stone_brick_stairs",
            (settings) -> new StairBlock(SMOOTH_STONE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS),
            true
    );
    public static final Block SMOOTH_STONE_BRICK_SLAB = register(
            "smooth_stone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS),
            true
    );
    public static final Block SMOOTH_STONE_BRICK_WALL = register(
            "smooth_stone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_BRICKS),
            true
    );
    public static final Block SMOOTH_STONE_TILES = register(
            "smooth_stone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE),
            true
    );
    public static final Block SMOOTH_STONE_TILE_STAIRS = register(
            "smooth_stone_tile_stairs",
            (settings) -> new StairBlock(SMOOTH_STONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_TILES),
            true
    );
    public static final Block SMOOTH_STONE_TILE_SLAB = register(
            "smooth_stone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_TILES),
            true
    );
    public static final Block SMOOTH_STONE_TILES_WALL = register(
            "smooth_stone_tiles_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE_TILES),
            true
    );
    public static final Block CARVED_OAK_PLANKS = register(
            "carved_oak_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS),
            true
    );
    public static final Block CARVED_SPRUCE_PLANKS = register(
            "carved_spruce_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS),
            true
    );
    public static final Block CARVED_BIRCH_PLANKS = register(
            "carved_birch_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS),
            true
    );
    public static final Block CARVED_JUNGLE_PLANKS = register(
            "carved_jungle_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS),
            true
    );
    public static final Block CARVED_ACACIA_PLANKS = register(
            "carved_acacia_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS),
            true
    );
    public static final Block CARVED_DARK_OAK_PLANKS = register(
            "carved_dark_oak_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS),
            true
    );
    public static final Block CARVED_MANGROVE_PLANKS = register(
            "carved_mangrove_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS),
            true
    );
    public static final Block CARVED_CHERRY_PLANKS = register(
            "carved_cherry_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS),
            true
    );
    public static final Block CARVED_BAMBOO_PLANKS = register(
            "carved_bamboo_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS),
            true
    );
    public static final Block CARVED_CRIMSON_PLANKS = register(
            "carved_crimson_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS),
            true
    );
    public static final Block CARVED_WARPED_PLANKS = register(
            "carved_warped_planks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS),
            true
    );
    public static final Block OAK_FLOORING = register(
            "oak_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS),
            true
    );
    public static final Block SPRUCE_FLOORING = register(
            "spruce_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS),
            true
    );
    public static final Block BIRCH_FLOORING = register(
            "birch_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS),
            true
    );
    public static final Block JUNGLE_FLOORING = register(
            "jungle_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS),
            true
    );
    public static final Block ACACIA_FLOORING = register(
            "acacia_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS),
            true
    );
    public static final Block DARK_OAK_FLOORING = register(
            "dark_oak_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS),
            true
    );
    public static final Block MANGROVE_FLOORING = register(
            "mangrove_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS),
            true
    );
    public static final Block CHERRY_FLOORING = register(
            "cherry_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS),
            true
    );
    public static final Block CRIMSON_FLOORING = register(
            "crimson_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS),
            true
    );
    public static final Block WARPED_FLOORING = register(
            "warped_flooring",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS),
            true
    );
    public static final Block OAK_FLOORING_STAIRS = register(
            "oak_flooring_stairs",
            (settings) -> new StairBlock(OAK_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(OAK_FLOORING),
            true
    );
    public static final Block OAK_FLOORING_SLAB = register(
            "oak_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(OAK_FLOORING),
            true
    );
    public static final Block SPRUCE_FLOORING_STAIRS = register(
            "spruce_flooring_stairs",
            (settings) -> new StairBlock(SPRUCE_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SPRUCE_FLOORING),
            true
    );
    public static final Block SPRUCE_FLOORING_SLAB = register(
            "spruce_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SPRUCE_FLOORING),
            true
    );
    public static final Block BIRCH_FLOORING_STAIRS = register(
            "birch_flooring_stairs",
            (settings) -> new StairBlock(BIRCH_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BIRCH_FLOORING),
            true
    );
    public static final Block BIRCH_FLOORING_SLAB = register(
            "birch_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BIRCH_FLOORING),
            true
    );
    public static final Block JUNGLE_FLOORING_STAIRS = register(
            "jungle_flooring_stairs",
            (settings) -> new StairBlock(JUNGLE_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(JUNGLE_FLOORING),
            true
    );
    public static final Block JUNGLE_FLOORING_SLAB = register(
            "jungle_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(JUNGLE_FLOORING),
            true
    );
    public static final Block ACACIA_FLOORING_STAIRS = register(
            "acacia_flooring_stairs",
            (settings) -> new StairBlock(ACACIA_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(ACACIA_FLOORING),
            true
    );
    public static final Block ACACIA_FLOORING_SLAB = register(
            "acacia_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ACACIA_FLOORING),
            true
    );
    public static final Block DARK_OAK_FLOORING_STAIRS = register(
            "dark_oak_flooring_stairs",
            (settings) -> new StairBlock(DARK_OAK_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(DARK_OAK_FLOORING),
            true
    );
    public static final Block DARK_OAK_FLOORING_SLAB = register(
            "dark_oak_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DARK_OAK_FLOORING),
            true
    );
    public static final Block MANGROVE_FLOORING_STAIRS = register(
            "mangrove_flooring_stairs",
            (settings) -> new StairBlock(MANGROVE_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(MANGROVE_FLOORING),
            true
    );
    public static final Block MANGROVE_FLOORING_SLAB = register(
            "mangrove_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MANGROVE_FLOORING),
            true
    );
    public static final Block CHERRY_FLOORING_STAIRS = register(
            "cherry_flooring_stairs",
            (settings) -> new StairBlock(CHERRY_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(CHERRY_FLOORING),
            true
    );
    public static final Block CHERRY_FLOORING_SLAB = register(
            "cherry_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CHERRY_FLOORING),
            true
    );
    public static final Block CRIMSON_FLOORING_STAIRS = register(
            "crimson_flooring_stairs",
            (settings) -> new StairBlock(CRIMSON_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(CRIMSON_FLOORING),
            true
    );
    public static final Block CRIMSON_FLOORING_SLAB = register(
            "crimson_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CRIMSON_FLOORING),
            true
    );
    public static final Block WARPED_FLOORING_STAIRS = register(
            "warped_flooring_stairs",
            (settings) -> new StairBlock(WARPED_FLOORING.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(WARPED_FLOORING),
            true
    );
    public static final Block WARPED_FLOORING_SLAB = register(
            "warped_flooring_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WARPED_FLOORING),
            true
    );
    public static final Block INFESTED_MOSSY_COBBLESTONE = register(
            "infested_mossy_cobblestone",
            (settings) -> new InfestedBlock(Blocks.MOSSY_COBBLESTONE,settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE),
            true
    );
    public static final Block COBBLESTONE_BRICKS = register(
            "cobblestone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE),
            true
    );
    public static final Block INFESTED_COBBLESTONE_BRICKS = register(
            "infested_cobblestone_bricks",
            (settings) -> new InfestedBlock(COBBLESTONE_BRICKS,settings),
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS),
            true
    );
    public static final Block COBBLESTONE_BRICK_STAIRS = register(
            "cobblestone_brick_stairs",
            (settings) -> new StairBlock(COBBLESTONE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS),
            true
    );
    public static final Block COBBLESTONE_BRICK_SLAB = register(
            "cobblestone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS),
            true
    );
    public static final Block COBBLESTONE_BRICK_WALL = register(
            "cobblestone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_BRICKS),
            true
    );
    public static final Block MOSSY_COBBLESTONE_BRICKS = register(
            "mossy_cobblestone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE),
            true
    );
    public static final Block INFESTED_MOSSY_COBBLESTONE_BRICKS = register(
            "infested_mossy_cobblestone_bricks",
            (settings) -> new InfestedBlock(MOSSY_COBBLESTONE_BRICKS,settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS),
            true
    );
    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = register(
            "mossy_cobblestone_brick_stairs",
            (settings) -> new StairBlock(MOSSY_COBBLESTONE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS),
            true
    );
    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = register(
            "mossy_cobblestone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS),
            true
    );
    public static final Block MOSSY_COBBLESTONE_BRICK_WALL = register(
            "mossy_cobblestone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_BRICKS),
            true
    );
    public static final Block POLISHED_COBBLESTONE = register(
            "polished_cobblestone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE),
            true
    );
    public static final Block POLISHED_COBBLESTONE_STAIRS = register(
            "polished_cobblestone_stairs",
            (settings) -> new StairBlock(POLISHED_COBBLESTONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_COBBLESTONE),
            true
    );
    public static final Block POLISHED_COBBLESTONE_SLAB = register(
            "polished_cobblestone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_COBBLESTONE),
            true
    );
    public static final Block POLISHED_COBBLESTONE_WALL = register(
            "polished_cobblestone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_COBBLESTONE),
            true
    );
    public static final Block COBBLESTONE_TILES = register(
            "cobblestone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE),
            true
    );
    public static final Block COBBLESTONE_TILE_STAIRS = register(
            "cobblestone_tile_stairs",
            (settings) -> new StairBlock(COBBLESTONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_TILES),
            true
    );
    public static final Block COBBLESTONE_TILE_SLAB = register(
            "cobblestone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_TILES),
            true
    );
    public static final Block COBBLESTONE_TILE_WALL = register(
            "cobblestone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_TILES),
            true
    );
    public static final Block POLISHED_MOSSY_COBBLESTONE = register(
            "polished_mossy_cobblestone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE),
            true
    );
    public static final Block POLISHED_MOSSY_COBBLESTONE_STAIRS = register(
            "polished_mossy_cobblestone_stairs",
            (settings) -> new StairBlock(POLISHED_MOSSY_COBBLESTONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_MOSSY_COBBLESTONE),
            true
    );
    public static final Block POLISHED_MOSSY_COBBLESTONE_SLAB = register(
            "polished_mossy_cobblestone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_MOSSY_COBBLESTONE),
            true
    );
    public static final Block POLISHED_MOSSY_COBBLESTONE_WALL = register(
            "polished_mossy_cobblestone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_MOSSY_COBBLESTONE),
            true
    );
    public static final Block MOSSY_COBBLESTONE_TILES = register(
            "mossy_cobblestone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE),
            true
    );
    public static final Block MOSSY_COBBLESTONE_TILE_STAIRS = register(
            "mossy_cobblestone_tile_stairs",
            (settings) -> new StairBlock(MOSSY_COBBLESTONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_TILES),
            true
    );
    public static final Block MOSSY_COBBLESTONE_TILE_SLAB = register(
            "mossy_cobblestone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_TILES),
            true
    );
    public static final Block MOSSY_COBBLESTONE_TILE_WALL = register(
            "mossy_cobblestone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_TILES),
            true
    );
    public static final Block INFESTED_COBBLESTONE_TILES = register(
            "infested_cobblestone_tiles",
            (settings) -> new InfestedBlock(COBBLESTONE_TILES,settings),
            BlockBehaviour.Properties.ofFullCopy(COBBLESTONE_TILES),
            true
    );
    public static final Block INFESTED_MOSSY_COBBLESTONE_TILES = register(
            "infested_mossy_cobblestone_tiles",
            (settings) -> new InfestedBlock(MOSSY_COBBLESTONE_TILES,settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_COBBLESTONE_TILES),
            true
    );
    public static final Block INFESTED_POLISHED_COBBLESTONE = register(
            "infested_polished_cobblestone",
            (settings) -> new InfestedBlock(POLISHED_COBBLESTONE,settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_COBBLESTONE),
            true
    );
    public static final Block INFESTED_POLISHED_MOSSY_COBBLESTONE = register(
            "infested_polished_mossy_cobblestone",
            (settings) -> new InfestedBlock(POLISHED_MOSSY_COBBLESTONE,settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_MOSSY_COBBLESTONE),
            true
    );
    public static final Block MOSSY_CRACKED_STONE_BRICKS = register(
            "mossy_cracked_stone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS),
            true
    );
    public static final Block INFESTED_MOSSY_CRACKED_STONE_BRICKS = register(
            "infested_mossy_cracked_stone_bricks",
            (settings) -> new InfestedBlock(MOSSY_CRACKED_STONE_BRICKS,settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_CRACKED_STONE_BRICKS),
            true
    );
    public static final Block MOSSY_CHISELED_STONE_BRICKS = register(
            "mossy_chiseled_stone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_STONE_BRICKS),
            true
    );
    public static final Block INFESTED_MOSSY_CHISELED_STONE_BRICKS = register(
            "infested_mossy_chiseled_stone_bricks",
            (settings) -> new InfestedBlock(MOSSY_CHISELED_STONE_BRICKS,settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_CHISELED_STONE_BRICKS),
            true
    );
    public static final Block STONE_TILES = register(
            "stone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE),
            true
    );
    public static final Block INFESTED_STONE_TILES = register(
            "infested_stone_tiles",
            (settings) -> new InfestedBlock(STONE_TILES,settings),
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES),
            true
    );
    public static final Block STONE_TILE_STAIRS = register(
            "stone_tile_stairs",
            (settings) -> new StairBlock(STONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES),
            true
    );
    public static final Block STONE_TILE_SLAB = register(
            "stone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES),
            true
    );
    public static final Block STONE_TILE_WALL = register(
            "stone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES),
            true
    );
    public static final Block MOSSY_STONE_TILES = register(
            "mossy_stone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS),
            true
    );
    public static final Block INFESTED_MOSSY_STONE_TILES = register(
            "infested_mossy_stone_tiles",
            (settings) -> new InfestedBlock(MOSSY_STONE_TILES,settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES),
            true
    );
    public static final Block MOSSY_STONE_TILE_STAIRS = register(
            "mossy_stone_tile_stairs",
            (settings) -> new StairBlock(MOSSY_STONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES),
            true
    );
    public static final Block MOSSY_STONE_TILE_SLAB = register(
            "mossy_stone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES),
            true
    );
    public static final Block MOSSY_STONE_TILE_WALL = register(
            "mossy_stone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES),
            true
    );
    public static final Block POLISHED_ANDESITE_WALL = register(
            "polished_andesite_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE),
            true
    );
    public static final Block CHISELED_ANDESITE = register(
            "chiseled_andesite",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE),
            true
    );
    public static final Block ANDESITE_BRICKS = register(
            "andesite_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE),
            true
    );
    public static final Block ANDESITE_BRICK_STAIRS = register(
            "andesite_brick_stairs",
            (settings) -> new StairBlock(ANDESITE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS),
            true
    );
    public static final Block ANDESITE_BRICK_SLAB = register(
            "andesite_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS),
            true
    );
    public static final Block ANDESITE_BRICK_WALL = register(
            "andesite_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS),
            true
    );
    public static final Block ANDESITE_TILES = register(
            "andesite_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE),
            true
    );
    public static final Block ANDESITE_TILE_STAIRS = register(
            "andesite_tile_stairs",
            (settings) -> new StairBlock(ANDESITE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_TILES),
            true
    );
    public static final Block ANDESITE_TILE_SLAB = register(
            "andesite_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_TILES),
            true
    );
    public static final Block ANDESITE_TILE_WALL = register(
            "andesite_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_TILES),
            true
    );
    public static final Block POLISHED_DIORITE_WALL = register(
            "polished_diorite_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE),
            true
    );
    public static final Block CHISELED_DIORITE = register(
            "chiseled_diorite",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE),
            true
    );
    public static final Block DIORITE_BRICKS = register(
            "diorite_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE),
            true
    );
    public static final Block DIORITE_BRICK_STAIRS = register(
            "diorite_brick_stairs",
            (settings) -> new StairBlock(DIORITE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(DIORITE_BRICKS),
            true
    );
    public static final Block DIORITE_BRICK_SLAB = register(
            "diorite_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DIORITE_BRICKS),
            true
    );
    public static final Block DIORITE_BRICK_WALL = register(
            "diorite_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DIORITE_BRICKS),
            true
    );
    public static final Block DIORITE_TILES = register(
            "diorite_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE),
            true
    );
    public static final Block DIORITE_TILE_STAIRS = register(
            "diorite_tile_stairs",
            (settings) -> new StairBlock(DIORITE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(DIORITE_TILES),
            true
    );
    public static final Block DIORITE_TILE_SLAB = register(
            "diorite_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DIORITE_TILES),
            true
    );
    public static final Block DIORITE_TILE_WALL = register(
            "diorite_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DIORITE_TILES),
            true
    );
    public static final Block POLISHED_GRANITE_WALL = register(
            "polished_granite_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE),
            true
    );
    public static final Block CHISELED_GRANITE = register(
            "chiseled_granite",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE),
            true
    );
    public static final Block GRANITE_BRICKS = register(
            "granite_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE),
            true
    );
    public static final Block GRANITE_BRICK_STAIRS = register(
            "granite_brick_stairs",
            (settings) -> new StairBlock(GRANITE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(GRANITE_BRICKS),
            true
    );
    public static final Block GRANITE_BRICK_SLAB = register(
            "granite_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRANITE_BRICKS),
            true
    );
    public static final Block GRANITE_BRICK_WALL = register(
            "granite_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRANITE_BRICKS),
            true
    );
    public static final Block GRANITE_TILES = register(
            "granite_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE),
            true
    );
    public static final Block GRANITE_TILE_STAIRS = register(
            "granite_tile_stairs",
            (settings) -> new StairBlock(GRANITE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(GRANITE_TILES),
            true
    );
    public static final Block GRANITE_TILE_SLAB = register(
            "granite_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRANITE_TILES),
            true
    );
    public static final Block GRANITE_TILE_WALL = register(
            "granite_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRANITE_TILES),
            true
    );
    public static final Block DRIPSTONE_STAIRS = register(
            "dripstone_stairs",
            (settings) -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block DRIPSTONE_SLAB = register(
            "dripstone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block DRIPSTONE_WALL = register(
            "dripstone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block POLISHED_DRIPSTONE = register(
            "polished_dripstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block POLISHED_DRIPSTONE_STAIRS = register(
            "polished_dripstone_stairs",
            (settings) -> new StairBlock(POLISHED_DRIPSTONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_DRIPSTONE),
            true
    );
    public static final Block POLISHED_DRIPSTONE_SLAB = register(
            "polished_dripstone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_DRIPSTONE),
            true
    );
    public static final Block POLISHED_DRIPSTONE_WALL = register(
            "polished_dripstone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_DRIPSTONE),
            true
    );
    public static final Block CHISELED_DRIPSTONE = register(
            "chiseled_dripstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block DRIPSTONE_BRICKS = register(
            "dripstone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block DRIPSTONE_BRICK_STAIRS = register(
            "dripstone_brick_stairs",
            (settings) -> new StairBlock(DRIPSTONE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BRICKS),
            true
    );
    public static final Block DRIPSTONE_BRICK_SLAB = register(
            "dripstone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BRICKS),
            true
    );
    public static final Block DRIPSTONE_BRICK_WALL = register(
            "dripstone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BRICKS),
            true
    );
    public static final Block DRIPSTONE_TILES = register(
            "dripstone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK),
            true
    );
    public static final Block DRIPSTONE_TILE_STAIRS = register(
            "dripstone_tile_stairs",
            (settings) -> new StairBlock(DRIPSTONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_TILES),
            true
    );
    public static final Block DRIPSTONE_TILE_SLAB = register(
            "dripstone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_TILES),
            true
    );
    public static final Block DRIPSTONE_TILE_WALL = register(
            "dripstone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_TILES),
            true
    );
    public static final Block PRISMARINE_BRICK_WALL = register(
            "prismarine_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS),
            true
    );
    public static final Block DARK_PRISMARINE_WALL = register(
            "dark_prismarine_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE),
            true
    );
    public static final Block SMOOTH_SANDSTONE_WALL = register(
            "smooth_sandstone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE),
            true
    );
    public static final Block CUT_SANDSTONE_STAIRS = register(
            "cut_sandstone_stairs",
            (settings) -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE),
            true
    );
    public static final Block CUT_SANDSTONE_WALL = register(
            "cut_sandstone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE),
            true
    );
    public static final Block SANDSTONE_BRICKS = register(
            "sandstone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE),
            true
    );
    public static final Block SANDSTONE_BRICK_STAIRS = register(
            "sandstone_brick_stairs",
            (settings) -> new StairBlock(SANDSTONE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SANDSTONE_BRICKS),
            true
    );
    public static final Block SANDSTONE_BRICK_SLAB = register(
            "sandstone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SANDSTONE_BRICKS),
            true
    );
    public static final Block SANDSTONE_BRICK_WALL = register(
            "sandstone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SANDSTONE_BRICKS),
            true
    );
    public static final Block SANDSTONE_TILES = register(
            "sandstone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE),
            true
    );
    public static final Block SANDSTONE_TILE_STAIRS = register(
            "sandstone_tile_stairs",
            (settings) -> new StairBlock(SANDSTONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SANDSTONE_TILES),
            true
    );
    public static final Block SANDSTONE_TILE_SLAB = register(
            "sandstone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SANDSTONE_TILES),
            true
    );
    public static final Block SANDSTONE_TILE_WALL = register(
            "sandstone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SANDSTONE_TILES),
            true
    );
    public static final Block SMOOTH_RED_SANDSTONE_WALL = register(
            "smooth_red_sandstone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE),
            true
    );
    public static final Block CUT_RED_SANDSTONE_STAIRS = register(
            "cut_red_sandstone_stairs",
            (settings) -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE),
            true
    );
    public static final Block CUT_RED_SANDSTONE_WALL = register(
            "cut_red_sandstone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE),
            true
    );
    public static final Block RED_SANDSTONE_BRICKS = register(
            "red_sandstone_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE),
            true
    );
    public static final Block RED_SANDSTONE_BRICK_STAIRS = register(
            "red_sandstone_brick_stairs",
            (settings) -> new StairBlock(RED_SANDSTONE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_BRICKS),
            true
    );
    public static final Block RED_SANDSTONE_BRICK_SLAB = register(
            "red_sandstone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_BRICKS),
            true
    );
    public static final Block RED_SANDSTONE_BRICK_WALL = register(
            "red_sandstone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_BRICKS),
            true
    );
    public static final Block RED_SANDSTONE_TILES = register(
            "red_sandstone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE),
            true
    );
    public static final Block RED_SANDSTONE_TILE_STAIRS = register(
            "red_sandstone_tile_stairs",
            (settings) -> new StairBlock(RED_SANDSTONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_TILES),
            true
    );
    public static final Block RED_SANDSTONE_TILE_SLAB = register(
            "red_sandstone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_TILES),
            true
    );
    public static final Block RED_SANDSTONE_TILE_WALL = register(
            "red_sandstone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_TILES),
            true
    );
    public static final Block DEEPSLATE_STAIRS = register(
            "deepslate_stairs",
            (settings) -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE),
            true
    );
    public static final Block DEEPSLATE_SLAB = register(
            "deepslate_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE),
            true
    );
    public static final Block DEEPSLATE_WALL = register(
            "deepslate_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE),
            true
    );
    public static final Block TUFF_TILES = register(
            "tuff_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF),
            true
    );
    public static final Block TUFF_TILE_STAIRS = register(
            "tuff_tile_stairs",
            (settings) -> new StairBlock(TUFF_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(TUFF_TILES),
            true
    );
    public static final Block TUFF_TILE_SLAB = register(
            "tuff_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(TUFF_TILES),
            true
    );
    public static final Block TUFF_TILE_WALL = register(
            "tuff_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(TUFF_TILES),
            true
    );
    public static final Block CALCITE_STAIRS = register(
            "calcite_stairs",
            (settings) -> new StairBlock(Blocks.CALCITE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block CALCITE_SLAB = register(
            "calcite_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block CALCITE_WALL = register(
            "calcite_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block CHISELED_CALCITE = register(
            "chiseled_calcite",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block POLISHED_CALCITE = register(
            "polished_calcite",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block POLISHED_CALCITE_STAIRS = register(
            "polished_calcite_stairs",
            (settings) -> new StairBlock(POLISHED_CALCITE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE),
            true
    );
    public static final Block POLISHED_CALCITE_SLAB = register(
            "polished_calcite_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE),
            true
    );
    public static final Block POLISHED_CALCITE_WALL = register(
            "polished_calcite_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_CALCITE),
            true
    );
    public static final Block CALCITE_BRICKS = register(
            "calcite_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block CALCITE_BRICK_STAIRS = register(
            "calcite_brick_stairs",
            (settings) -> new StairBlock(CALCITE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(CALCITE_BRICKS),
            true
    );
    public static final Block CALCITE_BRICK_SLAB = register(
            "calcite_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CALCITE_BRICKS),
            true
    );
    public static final Block CALCITE_BRICK_WALL = register(
            "calcite_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CALCITE_BRICKS),
            true
    );
    public static final Block CALCITE_TILES = register(
            "calcite_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE),
            true
    );
    public static final Block CALCITE_TILE_STAIRS = register(
            "calcite_tile_stairs",
            (settings) -> new StairBlock(CALCITE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(CALCITE_TILES),
            true
    );
    public static final Block CALCITE_TILE_SLAB = register(
            "calcite_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CALCITE_TILES),
            true
    );
    public static final Block CALCITE_TILE_WALL = register(
            "calcite_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CALCITE_TILES),
            true
    );
    public static final Block PACKED_MUD_STAIRS = register(
            "packed_mud_stairs",
            (settings) -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD),
            true
    );
    public static final Block PACKED_MUD_SLAB = register(
            "packed_mud_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD),
            true
    );
    public static final Block PACKED_MUD_WALL = register(
            "packed_mud_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD),
            true
    );
    public static final Block MUD_TILES = register(
            "mud_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD),
            true
    );
    public static final Block MUD_TILE_STAIRS = register(
            "mud_tile_stairs",
            (settings) -> new StairBlock(MUD_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(MUD_TILES),
            true
    );
    public static final Block MUD_TILE_SLAB = register(
            "mud_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MUD_TILES),
            true
    );
    public static final Block MUD_TILE_WALL = register(
            "mud_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MUD_TILES),
            true
    );
    public static final Block CHISELED_MUD_BRICKS = register(
            "chiseled_mud_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS),
            true
    );
    public static final Block SMOOTH_MUD = register(
            "smooth_mud",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS),
            true
    );
    public static final Block SMOOTH_MUD_STAIRS = register(
            "smooth_mud_stairs",
            (settings) -> new StairBlock(SMOOTH_MUD.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_MUD),
            true
    );
    public static final Block SMOOTH_MUD_SLAB = register(
            "smooth_mud_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_MUD),
            true
    );
    public static final Block SMOOTH_MUD_WALL = register(
            "smooth_mud_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_MUD),
            true
    );
    public static final Block CHISELED_OBSIDIAN = register(
            "chiseled_obsidian",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN),
            true
    );
    public static final Block POLISHED_OBSIDIAN = register(
            "polished_obsidian",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN),
            true
    );
    public static final Block POLISHED_OBSIDIAN_STAIRS = register(
            "polished_obsidian_stairs",
            (settings) -> new StairBlock(POLISHED_OBSIDIAN.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_OBSIDIAN),
            true
    );
    public static final Block POLISHED_OBSIDIAN_SLAB = register(
            "polished_obsidian_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_OBSIDIAN),
            true
    );
    public static final Block POLISHED_OBSIDIAN_WALL = register(
            "polished_obsidian_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_OBSIDIAN),
            true
    );
    public static final Block OBSIDIAN_BRICKS = register(
            "obsidian_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN),
            true
    );
    public static final Block OBSIDIAN_BRICK_STAIRS = register(
            "obsidian_brick_stairs",
            (settings) -> new StairBlock(OBSIDIAN_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(OBSIDIAN_BRICKS),
            true
    );
    public static final Block OBSIDIAN_BRICK_SLAB = register(
            "obsidian_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(OBSIDIAN_BRICKS),
            true
    );
    public static final Block OBSIDIAN_BRICK_WALL = register(
            "obsidian_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(OBSIDIAN_BRICKS),
            true
    );
    public static final Block OBSIDIAN_TILES = register(
            "obsidian_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN),
            true
    );
    public static final Block OBSIDIAN_TILE_STAIRS = register(
            "obsidian_tile_stairs",
            (settings) -> new StairBlock(OBSIDIAN_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(OBSIDIAN_TILES),
            true
    );
    public static final Block OBSIDIAN_TILE_SLAB = register(
            "obsidian_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(OBSIDIAN_TILES),
            true
    );
    public static final Block OBSIDIAN_TILE_WALL = register(
            "obsidian_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(OBSIDIAN_TILES),
            true
    );
    public static final Block CRACKED_RED_NETHER_BRICKS = register(
            "cracked_red_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS),
            true
    );
    public static final Block CHISELED_RED_NETHER_BRICKS = register(
            "chiseled_red_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS),
            true
    );
    public static final Block RED_NETHER_BRICK_FENCE = register(
            "red_nether_brick_fence",
            FenceBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS),
            true
    );
    public static final Block END_STONE_STAIRS = register(
            "end_stone_stairs",
            (settings) -> new StairBlock(Blocks.END_STONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),
            true
    );
    public static final Block END_STONE_SLAB = register(
            "end_stone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),
            true
    );
    public static final Block END_STONE_WALL = register(
            "end_stone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),
            true
    );
    public static final Block CHISELED_END_STONE = register(
            "chiseled_end_stone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),
            true
    );
    public static final Block POLISHED_END_STONE = register(
            "polished_end_stone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),
            true
    );
    public static final Block POLISHED_END_STONE_STAIRS = register(
            "polished_end_stone_stairs",
            (settings) -> new StairBlock(POLISHED_END_STONE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_END_STONE),
            true
    );
    public static final Block POLISHED_END_STONE_SLAB = register(
            "polished_end_stone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_END_STONE),
            true
    );
    public static final Block POLISHED_END_STONE_WALL = register(
            "polished_end_stone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_END_STONE),
            true
    );
    public static final Block END_STONE_TILES = register(
            "end_stone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE),
            true
    );
    public static final Block END_STONE_TILE_STAIRS = register(
            "end_stone_tile_stairs",
            (settings) -> new StairBlock(END_STONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(END_STONE_TILES),
            true
    );
    public static final Block END_STONE_TILE_SLAB = register(
            "end_stone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(END_STONE_TILES),
            true
    );
    public static final Block END_STONE_TILE_WALL = register(
            "end_stone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(END_STONE_TILES),
            true
    );
    public static final Block CHISELED_PURPUR = register(
            "chiseled_purpur",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK),
            true
    );
    public static final Block POLISHED_PURPUR = register(
            "polished_purpur",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK),
            true
    );
    public static final Block POLISHED_PURPUR_STAIRS = register(
            "polished_purpur_stairs",
            (settings) -> new StairBlock(POLISHED_PURPUR.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_PURPUR),
            true
    );
    public static final Block POLISHED_PURPUR_SLAB = register(
            "polished_purpur_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_PURPUR),
            true
    );
    public static final Block POLISHED_PURPUR_WALL = register(
            "polished_purpur_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_PURPUR),
            true
    );
    public static final Block PURPUR_BRICKS = register(
            "purpur_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK),
            true
    );
    public static final Block PURPUR_BRICK_STAIRS = register(
            "purpur_brick_stairs",
            (settings) -> new StairBlock(PURPUR_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(PURPUR_BRICKS),
            true
    );
    public static final Block PURPUR_BRICK_SLAB = register(
            "purpur_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PURPUR_BRICKS),
            true
    );
    public static final Block PURPUR_BRICK_WALL = register(
            "purpur_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PURPUR_BRICKS),
            true
    );
    public static final Block PURPUR_TILE_WALL = register(
            "purpur_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK),
            true
    );
    public static final Block BLACKSTONE_TILES = register(
            "blackstone_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE),
            true
    );
    public static final Block BLACKSTONE_TILE_STAIRS = register(
            "blackstone_tile_stairs",
            (settings) -> new StairBlock(BLACKSTONE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block BLACKSTONE_TILE_SLAB = register(
            "blackstone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block BLACKSTONE_TILE_WALL = register(
            "blackstone_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block SMOOTH_BASALT_STAIRS = register(
            "smooth_basalt_stairs",
            (settings) -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block SMOOTH_BASALT_SLAB = register(
            "smooth_basalt_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block SMOOTH_BASALT_WALL = register(
            "smooth_basalt_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block POLISHED_SMOOTH_BASALT = register(
            "polished_smooth_basalt",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block POLISHED_SMOOTH_BASALT_STAIRS = register(
            "polished_smooth_basalt_stairs",
            (settings) -> new StairBlock(POLISHED_SMOOTH_BASALT.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_SMOOTH_BASALT),
            true
    );
    public static final Block POLISHED_SMOOTH_BASALT_SLAB = register(
            "polished_smooth_basalt_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_SMOOTH_BASALT),
            true
    );
    public static final Block POLISHED_SMOOTH_BASALT_WALL = register(
            "polished_smooth_basalt_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_SMOOTH_BASALT),
            true
    );
    public static final Block SMOOTH_BASALT_BRICKS = register(
            "smooth_basalt_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block SMOOTH_BASALT_BRICK_STAIRS = register(
            "smooth_basalt_brick_stairs",
            (settings) -> new StairBlock(SMOOTH_BASALT_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS),
            true
    );
    public static final Block SMOOTH_BASALT_BRICK_SLAB = register(
            "smooth_basalt_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS),
            true
    );
    public static final Block SMOOTH_BASALT_BRICK_WALL = register(
            "smooth_basalt_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_BRICKS),
            true
    );
    public static final Block CRACKED_SMOOTH_BASALT_BRICKS = register(
            "cracked_smooth_basalt_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block CHISELED_SMOOTH_BASALT = register(
            "chiseled_smooth_basalt",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block SMOOTH_BASALT_TILES = register(
            "smooth_basalt_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT),
            true
    );
    public static final Block SMOOTH_BASALT_TILE_STAIRS = register(
            "smooth_basalt_tile_stairs",
            (settings) -> new StairBlock(SMOOTH_BASALT_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_TILES),
            true
    );
    public static final Block SMOOTH_BASALT_TILE_SLAB = register(
            "smooth_basalt_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_TILES),
            true
    );
    public static final Block SMOOTH_BASALT_TILE_WALL = register(
            "smooth_basalt_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT_TILES),
            true
    );
    public static final Block PACKED_SNOW = register(
            "packed_snow",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK),
            true
    );
    public static final Block PACKED_SNOW_STAIRS = register(
            "packed_snow_stairs",
            (settings) -> new StairBlock(PACKED_SNOW.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(PACKED_SNOW),
            true
    );
    public static final Block PACKED_SNOW_SLAB = register(
            "packed_snow_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PACKED_SNOW),
            true
    );
    public static final Block PACKED_SNOW_WALL = register(
            "packed_snow_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PACKED_SNOW),
            true
    );
    public static final Block SNOW_BRICKS = register(
            "snow_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK),
            true
    );
    public static final Block SNOW_BRICK_STAIRS = register(
            "snow_brick_stairs",
            (settings) -> new StairBlock(SNOW_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(SNOW_BRICKS),
            true
    );
    public static final Block SNOW_BRICK_SLAB = register(
            "snow_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SNOW_BRICKS),
            true
    );
    public static final Block SNOW_BRICK_WALL = register(
            "snow_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(SNOW_BRICKS),
            true
    );
    public static final Block POLISHED_ICE = register(
            "polished_ice",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ICE),
            true
    );
    public static final Block POLISHED_ICE_STAIRS = register(
            "polished_ice_stairs",
            (settings) -> new StairBlock(POLISHED_ICE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(POLISHED_ICE),
            true
    );
    public static final Block POLISHED_ICE_SLAB = register(
            "polished_ice_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_ICE),
            true
    );
    public static final Block POLISHED_ICE_WALL = register(
            "polished_ice_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(POLISHED_ICE),
            true
    );
    public static final Block ICE_BRICKS = register(
            "ice_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ICE),
            true
    );
    public static final Block ICE_BRICK_STAIRS = register(
            "ice_brick_stairs",
            (settings) -> new StairBlock(ICE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(ICE_BRICKS),
            true
    );
    public static final Block ICE_BRICK_SLAB = register(
            "ice_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ICE_BRICKS),
            true
    );
    public static final Block ICE_BRICK_WALL = register(
            "ice_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ICE_BRICKS),
            true
    );
    public static final Block ICE_TILES = register(
            "ice_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ICE),
            true
    );
    public static final Block ICE_TILE_STAIRS = register(
            "ice_tile_stairs",
            (settings) -> new StairBlock(ICE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(ICE_TILES),
            true
    );
    public static final Block ICE_TILE_SLAB = register(
            "ice_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ICE_TILES),
            true
    );
    public static final Block ICE_TILE_WALL = register(
            "ice_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ICE_TILES),
            true
    );
    public static final Block CHISELED_ICE = register(
            "chiseled_ice",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ICE),
            true
    );
    public static final Block POLISHED_PACKED_ICE = register(
            "polished_packed_ice",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block POLISHED_PACKED_ICE_STAIRS = register(
            "polished_packed_ice_stairs",
            (settings) -> new StairBlock(Blocks.PACKED_ICE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block POLISHED_PACKED_ICE_SLAB = register(
            "polished_packed_ice_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block POLISHED_PACKED_ICE_WALL = register(
            "polished_packed_ice_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block PACKED_ICE_BRICKS = register(
            "packed_ice_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block PACKED_ICE_BRICK_STAIRS = register(
            "packed_ice_brick_stairs",
            (settings) -> new StairBlock(PACKED_ICE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(PACKED_ICE_BRICKS),
            true
    );
    public static final Block PACKED_ICE_BRICK_SLAB = register(
            "packed_ice_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PACKED_ICE_BRICKS),
            true
    );
    public static final Block PACKED_ICE_BRICK_WALL = register(
            "packed_ice_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PACKED_ICE_BRICKS),
            true
    );
    public static final Block PACKED_ICE_TILES = register(
            "packed_ice_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block PACKED_ICE_TILE_STAIRS = register(
            "packed_ice_tile_stairs",
            (settings) -> new StairBlock(PACKED_ICE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(PACKED_ICE_TILES),
            true
    );
    public static final Block PACKED_ICE_TILE_SLAB = register(
            "packed_ice_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PACKED_ICE_TILES),
            true
    );
    public static final Block PACKED_ICE_TILE_WALL = register(
            "packed_ice_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PACKED_ICE_TILES),
            true
    );
    public static final Block CHISELED_PACKED_ICE = register(
            "chiseled_packed_ice",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE),
            true
    );
    public static final Block POLISHED_BLUE_ICE = register(
            "polished_blue_ice",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block POLISHED_BLUE_ICE_STAIRS = register(
            "polished_blue_ice_stairs",
            (settings) -> new StairBlock(Blocks.BLUE_ICE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block POLISHED_BLUE_ICE_SLAB = register(
            "polished_blue_ice_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block POLISHED_BLUE_ICE_WALL = register(
            "polished_blue_ice_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block BLUE_ICE_BRICKS = register(
            "blue_ice_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block BLUE_ICE_BRICK_STAIRS = register(
            "blue_ice_brick_stairs",
            (settings) -> new StairBlock(BLUE_ICE_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BLUE_ICE_BRICKS),
            true
    );
    public static final Block BLUE_ICE_BRICK_SLAB = register(
            "blue_ice_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLUE_ICE_BRICKS),
            true
    );
    public static final Block BLUE_ICE_BRICK_WALL = register(
            "blue_ice_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLUE_ICE_BRICKS),
            true
    );
    public static final Block BLUE_ICE_TILES = register(
            "blue_ice_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block BLUE_ICE_TILE_STAIRS = register(
            "blue_ice_tile_stairs",
            (settings) -> new StairBlock(BLUE_ICE_TILES.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BLUE_ICE_TILES),
            true
    );
    public static final Block BLUE_ICE_TILE_SLAB = register(
            "blue_ice_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLUE_ICE_TILES),
            true
    );
    public static final Block BLUE_ICE_TILE_WALL = register(
            "blue_ice_tile_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLUE_ICE_TILES),
            true
    );
    public static final Block CHISELED_BLUE_ICE = register(
            "chiseled_blue_ice",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ICE),
            true
    );
    public static final Block WHITE_THREADED_WOOL = register(
            "white_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL),
            true
    );
    public static final Block WHITE_THREADED_CARPET = register(
            "white_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET),
            true
    );
    public static final Block LIGHT_GRAY_THREADED_WOOL = register(
            "light_gray_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL),
            true
    );
    public static final Block LIGHT_GRAY_THREADED_CARPET = register(
            "light_gray_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CARPET),
            true
    );
    public static final Block GRAY_THREADED_WOOL = register(
            "gray_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL),
            true
    );
    public static final Block GRAY_THREADED_CARPET = register(
            "gray_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CARPET),
            true
    );
    public static final Block BLACK_THREADED_WOOL = register(
            "black_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL),
            true
    );
    public static final Block BLACK_THREADED_CARPET = register(
            "black_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CARPET),
            true
    );
    public static final Block BROWN_THREADED_WOOL = register(
            "brown_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL),
            true
    );
    public static final Block BROWN_THREADED_CARPET = register(
            "brown_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CARPET),
            true
    );
    public static final Block RED_THREADED_WOOL = register(
            "red_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL),
            true
    );
    public static final Block RED_THREADED_CARPET = register(
            "red_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CARPET),
            true
    );
    public static final Block ORANGE_THREADED_WOOL = register(
            "orange_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL),
            true
    );
    public static final Block ORANGE_THREADED_CARPET = register(
            "orange_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CARPET),
            true
    );
    public static final Block YELLOW_THREADED_WOOL = register(
            "yellow_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL),
            true
    );
    public static final Block YELLOW_THREADED_CARPET = register(
            "yellow_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CARPET),
            true
    );
    public static final Block LIME_THREADED_WOOL = register(
            "lime_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL),
            true
    );
    public static final Block LIME_THREADED_CARPET = register(
            "lime_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CARPET),
            true
    );
    public static final Block GREEN_THREADED_WOOL = register(
            "green_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL),
            true
    );
    public static final Block GREEN_THREADED_CARPET = register(
            "green_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CARPET),
            true
    );
    public static final Block CYAN_THREADED_WOOL = register(
            "cyan_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL),
            true
    );
    public static final Block CYAN_THREADED_CARPET = register(
            "cyan_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CARPET),
            true
    );
    public static final Block LIGHT_BLUE_THREADED_WOOL = register(
            "light_blue_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL),
            true
    );
    public static final Block LIGHT_BLUE_THREADED_CARPET = register(
            "light_blue_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CARPET),
            true
    );
    public static final Block BLUE_THREADED_WOOL = register(
            "blue_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL),
            true
    );
    public static final Block BLUE_THREADED_CARPET = register(
            "blue_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CARPET),
            true
    );
    public static final Block PURPLE_THREADED_WOOL = register(
            "purple_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL),
            true
    );
    public static final Block PURPLE_THREADED_CARPET = register(
            "purple_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CARPET),
            true
    );
    public static final Block MAGENTA_THREADED_WOOL = register(
            "magenta_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL),
            true
    );
    public static final Block MAGENTA_THREADED_CARPET = register(
            "magenta_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CARPET),
            true
    );
    public static final Block PINK_THREADED_WOOL = register(
            "pink_threaded_wool",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL),
            true
    );
    public static final Block PINK_THREADED_CARPET = register(
            "pink_threaded_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CARPET),
            true
    );
    public static final Block TERRACOTTA_STAIRS = register(
            "terracotta_stairs",
            (settings) -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA),
            true
    );
    public static final Block TERRACOTTA_SLAB = register(
            "terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA),
            true
    );
    public static final Block TERRACOTTA_WALL = register(
            "terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register(
            "light_gray_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register(
            "light_gray_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = register(
            "light_gray_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA),
            true
    );
    public static final Block GRAY_TERRACOTTA_STAIRS = register(
            "gray_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA),
            true
    );
    public static final Block GRAY_TERRACOTTA_SLAB = register(
            "gray_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA),
            true
    );
    public static final Block GRAY_TERRACOTTA_WALL = register(
            "gray_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA),
            true
    );
    public static final Block BLACK_TERRACOTTA_STAIRS = register(
            "black_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA),
            true
    );
    public static final Block BLACK_TERRACOTTA_SLAB = register(
            "black_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA),
            true
    );
    public static final Block BLACK_TERRACOTTA_WALL = register(
            "black_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA),
            true
    );
    public static final Block WHITE_TERRACOTTA_STAIRS = register(
            "white_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA),
            true
    );
    public static final Block WHITE_TERRACOTTA_SLAB = register(
            "white_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA),
            true
    );
    public static final Block WHITE_TERRACOTTA_WALL = register(
            "white_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA),
            true
    );
    public static final Block BROWN_TERRACOTTA_STAIRS = register(
            "brown_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA),
            true
    );
    public static final Block BROWN_TERRACOTTA_SLAB = register(
            "brown_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA),
            true
    );
    public static final Block BROWN_TERRACOTTA_WALL = register(
            "brown_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA),
            true
    );
    public static final Block RED_TERRACOTTA_STAIRS = register(
            "red_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA),
            true
    );
    public static final Block RED_TERRACOTTA_SLAB = register(
            "red_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA),
            true
    );
    public static final Block RED_TERRACOTTA_WALL = register(
            "red_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA),
            true
    );
    public static final Block ORANGE_TERRACOTTA_STAIRS = register(
            "orange_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA),
            true
    );
    public static final Block ORANGE_TERRACOTTA_SLAB = register(
            "orange_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA),
            true
    );
    public static final Block ORANGE_TERRACOTTA_WALL = register(
            "orange_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA),
            true
    );
    public static final Block YELLOW_TERRACOTTA_STAIRS = register(
            "yellow_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA),
            true
    );
    public static final Block YELLOW_TERRACOTTA_SLAB = register(
            "yellow_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA),
            true
    );
    public static final Block YELLOW_TERRACOTTA_WALL = register(
            "yellow_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA),
            true
    );
    public static final Block LIME_TERRACOTTA_STAIRS = register(
            "lime_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA),
            true
    );
    public static final Block LIME_TERRACOTTA_SLAB = register(
            "lime_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA),
            true
    );
    public static final Block LIME_TERRACOTTA_WALL = register(
            "lime_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA),
            true
    );
    public static final Block GREEN_TERRACOTTA_STAIRS = register(
            "green_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA),
            true
    );
    public static final Block GREEN_TERRACOTTA_SLAB = register(
            "green_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA),
            true
    );
    public static final Block GREEN_TERRACOTTA_WALL = register(
            "green_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA),
            true
    );
    public static final Block CYAN_TERRACOTTA_STAIRS = register(
            "cyan_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA),
            true
    );
    public static final Block CYAN_TERRACOTTA_SLAB = register(
            "cyan_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA),
            true
    );
    public static final Block CYAN_TERRACOTTA_WALL = register(
            "cyan_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register(
            "light_blue_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register(
            "light_blue_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = register(
            "light_blue_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA),
            true
    );
    public static final Block BLUE_TERRACOTTA_STAIRS = register(
            "blue_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA),
            true
    );
    public static final Block BLUE_TERRACOTTA_SLAB = register(
            "blue_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA),
            true
    );
    public static final Block BLUE_TERRACOTTA_WALL = register(
            "blue_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA),
            true
    );
    public static final Block PURPLE_TERRACOTTA_STAIRS = register(
            "purple_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA),
            true
    );
    public static final Block PURPLE_TERRACOTTA_SLAB = register(
            "purple_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA),
            true
    );
    public static final Block PURPLE_TERRACOTTA_WALL = register(
            "purple_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_STAIRS = register(
            "magenta_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_SLAB = register(
            "magenta_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_WALL = register(
            "magenta_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA),
            true
    );
    public static final Block PINK_TERRACOTTA_STAIRS = register(
            "pink_terracotta_stairs",
            (settings) -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA),
            true
    );
    public static final Block PINK_TERRACOTTA_SLAB = register(
            "pink_terracotta_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA),
            true
    );
    public static final Block PINK_TERRACOTTA_WALL = register(
            "pink_terracotta_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA),
            true
    );
    public static final Block TERRACOTTA_BRICKS = register(
            "terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA),
            true
    );
    public static final Block TERRACOTTA_BRICK_STAIRS = register(
            "terracotta_brick_stairs",
            (settings) -> new StairBlock(TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(TERRACOTTA_BRICKS),
            true
    );
    public static final Block TERRACOTTA_BRICK_SLAB = register(
            "terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(TERRACOTTA_BRICKS),
            true
    );
    public static final Block TERRACOTTA_BRICK_WALL = register(
            "terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(TERRACOTTA_BRICKS),
            true
    );
    public static final Block WHITE_TERRACOTTA_BRICKS = register(
            "white_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA),
            true
    );
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = register(
            "white_terracotta_brick_stairs",
            (settings) -> new StairBlock(WHITE_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(WHITE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = register(
            "white_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = register(
            "white_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = register(
            "light_gray_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = register(
            "light_gray_terracotta_brick_stairs",
            (settings) -> new StairBlock(LIGHT_GRAY_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = register(
            "light_gray_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = register(
            "light_gray_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LIGHT_GRAY_TERRACOTTA_BRICKS),
            true
    );
    public static final Block GRAY_TERRACOTTA_BRICKS = register(
            "gray_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA),
            true
    );
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = register(
            "gray_terracotta_brick_stairs",
            (settings) -> new StairBlock(GRAY_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(GRAY_TERRACOTTA_BRICKS),
            true
    );
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = register(
            "gray_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRAY_TERRACOTTA_BRICKS),
            true
    );
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = register(
            "gray_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRAY_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BLACK_TERRACOTTA_BRICKS = register(
            "black_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA),
            true
    );
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = register(
            "black_terracotta_brick_stairs",
            (settings) -> new StairBlock(BLACK_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BLACK_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = register(
            "black_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLACK_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = register(
            "black_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLACK_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BROWN_TERRACOTTA_BRICKS = register(
            "brown_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA),
            true
    );
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = register(
            "brown_terracotta_brick_stairs",
            (settings) -> new StairBlock(BROWN_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BROWN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = register(
            "brown_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BROWN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = register(
            "brown_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BROWN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block RED_TERRACOTTA_BRICKS = register(
            "red_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA),
            true
    );
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = register(
            "red_terracotta_brick_stairs",
            (settings) -> new StairBlock(RED_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(RED_TERRACOTTA_BRICKS),
            true
    );
    public static final Block RED_TERRACOTTA_BRICK_SLAB = register(
            "red_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(RED_TERRACOTTA_BRICKS),
            true
    );
    public static final Block RED_TERRACOTTA_BRICK_WALL = register(
            "red_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(RED_TERRACOTTA_BRICKS),
            true
    );
    public static final Block ORANGE_TERRACOTTA_BRICKS = register(
            "orange_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA),
            true
    );
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = register(
            "orange_terracotta_brick_stairs",
            (settings) -> new StairBlock(ORANGE_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(ORANGE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = register(
            "orange_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ORANGE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = register(
            "orange_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ORANGE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block YELLOW_TERRACOTTA_BRICKS = register(
            "yellow_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA),
            true
    );
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = register(
            "yellow_terracotta_brick_stairs",
            (settings) -> new StairBlock(YELLOW_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(YELLOW_TERRACOTTA_BRICKS),
            true
    );
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = register(
            "yellow_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(YELLOW_TERRACOTTA_BRICKS),
            true
    );
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = register(
            "yellow_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(YELLOW_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIME_TERRACOTTA_BRICKS = register(
            "lime_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA),
            true
    );
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = register(
            "lime_terracotta_brick_stairs",
            (settings) -> new StairBlock(LIME_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(LIME_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = register(
            "lime_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LIME_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIME_TERRACOTTA_BRICK_WALL = register(
            "lime_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LIME_TERRACOTTA_BRICKS),
            true
    );
    public static final Block GREEN_TERRACOTTA_BRICKS = register(
            "green_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA),
            true
    );
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = register(
            "green_terracotta_brick_stairs",
            (settings) -> new StairBlock(GREEN_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(GREEN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = register(
            "green_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GREEN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = register(
            "green_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GREEN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block CYAN_TERRACOTTA_BRICKS = register(
            "cyan_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA),
            true
    );
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = register(
            "cyan_terracotta_brick_stairs",
            (settings) -> new StairBlock(CYAN_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(CYAN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = register(
            "cyan_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CYAN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = register(
            "cyan_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CYAN_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = register(
            "light_blue_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = register(
            "light_blue_terracotta_brick_stairs",
            (settings) -> new StairBlock(LIGHT_BLUE_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = register(
            "light_blue_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = register(
            "light_blue_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(LIGHT_BLUE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BLUE_TERRACOTTA_BRICKS = register(
            "blue_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA),
            true
    );
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = register(
            "blue_terracotta_brick_stairs",
            (settings) -> new StairBlock(BLUE_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(BLUE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = register(
            "blue_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLUE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = register(
            "blue_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLUE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block PURPLE_TERRACOTTA_BRICKS = register(
            "purple_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA),
            true
    );
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = register(
            "purple_terracotta_brick_stairs",
            (settings) -> new StairBlock(PURPLE_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(PURPLE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = register(
            "purple_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PURPLE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = register(
            "purple_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PURPLE_TERRACOTTA_BRICKS),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_BRICKS = register(
            "magenta_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = register(
            "magenta_terracotta_brick_stairs",
            (settings) -> new StairBlock(MAGENTA_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(MAGENTA_TERRACOTTA_BRICKS),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = register(
            "magenta_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MAGENTA_TERRACOTTA_BRICKS),
            true
    );
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = register(
            "magenta_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MAGENTA_TERRACOTTA_BRICKS),
            true
    );
    public static final Block PINK_TERRACOTTA_BRICKS = register(
            "pink_terracotta_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA),
            true
    );
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = register(
            "pink_terracotta_brick_stairs",
            (settings) -> new StairBlock(PINK_TERRACOTTA_BRICKS.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(PINK_TERRACOTTA_BRICKS),
            true
    );
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = register(
            "pink_terracotta_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PINK_TERRACOTTA_BRICKS),
            true
    );
    public static final Block PINK_TERRACOTTA_BRICK_WALL = register(
            "pink_terracotta_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(PINK_TERRACOTTA_BRICKS),
            true
    );
    public static final Block WHITE_CONCRETE_STAIRS = register(
            "white_concrete_stairs",
            (settings) -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE),
            true
    );
    public static final Block WHITE_CONCRETE_SLAB = register(
            "white_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE),
            true
    );
    public static final Block WHITE_CONCRETE_WALL = register(
            "white_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE),
            true
    );
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register(
            "light_gray_concrete_stairs",
            (settings) -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE),
            true
    );
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = register(
            "light_gray_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE),
            true
    );
    public static final Block LIGHT_GRAY_CONCRETE_WALL = register(
            "light_gray_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE),
            true
    );
    public static final Block GRAY_CONCRETE_STAIRS = register(
            "gray_concrete_stairs",
            (settings) -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE),
            true
    );
    public static final Block GRAY_CONCRETE_SLAB = register(
            "gray_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE),
            true
    );
    public static final Block GRAY_CONCRETE_WALL = register(
            "gray_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE),
            true
    );
    public static final Block BLACK_CONCRETE_STAIRS = register(
            "black_concrete_stairs",
            (settings) -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE),
            true
    );
    public static final Block BLACK_CONCRETE_SLAB = register(
            "black_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE),
            true
    );
    public static final Block BLACK_CONCRETE_WALL = register(
            "black_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE),
            true
    );
    public static final Block BROWN_CONCRETE_STAIRS = register(
            "brown_concrete_stairs",
            (settings) -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE),
            true
    );
    public static final Block BROWN_CONCRETE_SLAB = register(
            "brown_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE),
            true
    );
    public static final Block BROWN_CONCRETE_WALL = register(
            "brown_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE),
            true
    );
    public static final Block RED_CONCRETE_STAIRS = register(
            "red_concrete_stairs",
            (settings) -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE),
            true
    );
    public static final Block RED_CONCRETE_SLAB = register(
            "red_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE),
            true
    );
    public static final Block RED_CONCRETE_WALL = register(
            "red_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE),
            true
    );
    public static final Block ORANGE_CONCRETE_STAIRS = register(
            "orange_concrete_stairs",
            (settings) -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE),
            true
    );
    public static final Block ORANGE_CONCRETE_SLAB = register(
            "orange_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE),
            true
    );
    public static final Block ORANGE_CONCRETE_WALL = register(
            "orange_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE),
            true
    );
    public static final Block YELLOW_CONCRETE_STAIRS = register(
            "yellow_concrete_stairs",
            (settings) -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE),
            true
    );
    public static final Block YELLOW_CONCRETE_SLAB = register(
            "yellow_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE),
            true
    );
    public static final Block YELLOW_CONCRETE_WALL = register(
            "yellow_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE),
            true
    );
    public static final Block LIME_CONCRETE_STAIRS = register(
            "lime_concrete_stairs",
            (settings) -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE),
            true
    );
    public static final Block LIME_CONCRETE_SLAB = register(
            "lime_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE),
            true
    );
    public static final Block LIME_CONCRETE_WALL = register(
            "lime_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE),
            true
    );
    public static final Block GREEN_CONCRETE_STAIRS = register(
            "green_concrete_stairs",
            (settings) -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE),
            true
    );
    public static final Block GREEN_CONCRETE_SLAB = register(
            "green_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE),
            true
    );
    public static final Block GREEN_CONCRETE_WALL = register(
            "green_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE),
            true
    );
    public static final Block CYAN_CONCRETE_STAIRS = register(
            "cyan_concrete_stairs",
            (settings) -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE),
            true
    );
    public static final Block CYAN_CONCRETE_SLAB = register(
            "cyan_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE),
            true
    );
    public static final Block CYAN_CONCRETE_WALL = register(
            "cyan_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE),
            true
    );
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register(
            "light_blue_concrete_stairs",
            (settings) -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE),
            true
    );
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = register(
            "light_blue_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE),
            true
    );
    public static final Block LIGHT_BLUE_CONCRETE_WALL = register(
            "light_blue_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE),
            true
    );
    public static final Block BLUE_CONCRETE_STAIRS = register(
            "blue_concrete_stairs",
            (settings) -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE),
            true
    );
    public static final Block BLUE_CONCRETE_SLAB = register(
            "blue_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE),
            true
    );
    public static final Block BLUE_CONCRETE_WALL = register(
            "blue_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE),
            true
    );
    public static final Block PURPLE_CONCRETE_STAIRS = register(
            "purple_concrete_stairs",
            (settings) -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE),
            true
    );
    public static final Block PURPLE_CONCRETE_SLAB = register(
            "purple_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE),
            true
    );
    public static final Block PURPLE_CONCRETE_WALL = register(
            "purple_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE),
            true
    );
    public static final Block MAGENTA_CONCRETE_STAIRS = register(
            "magenta_concrete_stairs",
            (settings) -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE),
            true
    );
    public static final Block MAGENTA_CONCRETE_SLAB = register(
            "magenta_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE),
            true
    );
    public static final Block MAGENTA_CONCRETE_WALL = register(
            "magenta_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE),
            true
    );
    public static final Block PINK_CONCRETE_STAIRS = register(
            "pink_concrete_stairs",
            (settings) -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(),settings),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE),
            true
    );
    public static final Block PINK_CONCRETE_SLAB = register(
            "pink_concrete_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE),
            true
    );
    public static final Block PINK_CONCRETE_WALL = register(
            "pink_concrete_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE),
            true
    );

//$blockRegistration:end

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {

        ResourceKey<Block> blockKey = keyOfBlock(name);

        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, NewBountifulBlocks.id(name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, NewBountifulBlocks.id(name));
    }

    public static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register((tab) -> {
            tab.accept(SMOOTH_MUD_PRESSURE_PLATE.asItem());
            tab.accept(SMOOTH_MUD_BUTTON.asItem());
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register((tab) -> {
            tab.accept(CARVED_SNOW.asItem());
            tab.accept(LARGE_CHAIN.asItem());
            //$tabRegistration:start
    tab.accept(STONE_WALL.asItem());
    tab.accept(CHISELED_SMOOTH_STONE.asItem());
    tab.accept(SMOOTH_STONE_STAIRS.asItem());
    tab.accept(SMOOTH_STONE_WALL.asItem());
    tab.accept(SMOOTH_STONE_BRICKS.asItem());
    tab.accept(SMOOTH_STONE_BRICK_STAIRS.asItem());
    tab.accept(SMOOTH_STONE_BRICK_SLAB.asItem());
    tab.accept(SMOOTH_STONE_BRICK_WALL.asItem());
    tab.accept(SMOOTH_STONE_TILES.asItem());
    tab.accept(SMOOTH_STONE_TILE_STAIRS.asItem());
    tab.accept(SMOOTH_STONE_TILE_SLAB.asItem());
    tab.accept(SMOOTH_STONE_TILES_WALL.asItem());
    tab.accept(CARVED_OAK_PLANKS.asItem());
    tab.accept(CARVED_SPRUCE_PLANKS.asItem());
    tab.accept(CARVED_BIRCH_PLANKS.asItem());
    tab.accept(CARVED_JUNGLE_PLANKS.asItem());
    tab.accept(CARVED_ACACIA_PLANKS.asItem());
    tab.accept(CARVED_DARK_OAK_PLANKS.asItem());
    tab.accept(CARVED_MANGROVE_PLANKS.asItem());
    tab.accept(CARVED_CHERRY_PLANKS.asItem());
    tab.accept(CARVED_BAMBOO_PLANKS.asItem());
    tab.accept(CARVED_CRIMSON_PLANKS.asItem());
    tab.accept(CARVED_WARPED_PLANKS.asItem());
    tab.accept(OAK_FLOORING.asItem());
    tab.accept(SPRUCE_FLOORING.asItem());
    tab.accept(BIRCH_FLOORING.asItem());
    tab.accept(JUNGLE_FLOORING.asItem());
    tab.accept(ACACIA_FLOORING.asItem());
    tab.accept(DARK_OAK_FLOORING.asItem());
    tab.accept(MANGROVE_FLOORING.asItem());
    tab.accept(CHERRY_FLOORING.asItem());
    tab.accept(CRIMSON_FLOORING.asItem());
    tab.accept(WARPED_FLOORING.asItem());
    tab.accept(OAK_FLOORING_STAIRS.asItem());
    tab.accept(OAK_FLOORING_SLAB.asItem());
    tab.accept(SPRUCE_FLOORING_STAIRS.asItem());
    tab.accept(SPRUCE_FLOORING_SLAB.asItem());
    tab.accept(BIRCH_FLOORING_STAIRS.asItem());
    tab.accept(BIRCH_FLOORING_SLAB.asItem());
    tab.accept(JUNGLE_FLOORING_STAIRS.asItem());
    tab.accept(JUNGLE_FLOORING_SLAB.asItem());
    tab.accept(ACACIA_FLOORING_STAIRS.asItem());
    tab.accept(ACACIA_FLOORING_SLAB.asItem());
    tab.accept(DARK_OAK_FLOORING_STAIRS.asItem());
    tab.accept(DARK_OAK_FLOORING_SLAB.asItem());
    tab.accept(MANGROVE_FLOORING_STAIRS.asItem());
    tab.accept(MANGROVE_FLOORING_SLAB.asItem());
    tab.accept(CHERRY_FLOORING_STAIRS.asItem());
    tab.accept(CHERRY_FLOORING_SLAB.asItem());
    tab.accept(CRIMSON_FLOORING_STAIRS.asItem());
    tab.accept(CRIMSON_FLOORING_SLAB.asItem());
    tab.accept(WARPED_FLOORING_STAIRS.asItem());
    tab.accept(WARPED_FLOORING_SLAB.asItem());
    tab.accept(INFESTED_MOSSY_COBBLESTONE.asItem());
    tab.accept(COBBLESTONE_BRICKS.asItem());
    tab.accept(INFESTED_COBBLESTONE_BRICKS.asItem());
    tab.accept(COBBLESTONE_BRICK_STAIRS.asItem());
    tab.accept(COBBLESTONE_BRICK_SLAB.asItem());
    tab.accept(COBBLESTONE_BRICK_WALL.asItem());
    tab.accept(MOSSY_COBBLESTONE_BRICKS.asItem());
    tab.accept(INFESTED_MOSSY_COBBLESTONE_BRICKS.asItem());
    tab.accept(MOSSY_COBBLESTONE_BRICK_STAIRS.asItem());
    tab.accept(MOSSY_COBBLESTONE_BRICK_SLAB.asItem());
    tab.accept(MOSSY_COBBLESTONE_BRICK_WALL.asItem());
    tab.accept(POLISHED_COBBLESTONE.asItem());
    tab.accept(POLISHED_COBBLESTONE_STAIRS.asItem());
    tab.accept(POLISHED_COBBLESTONE_SLAB.asItem());
    tab.accept(POLISHED_COBBLESTONE_WALL.asItem());
    tab.accept(COBBLESTONE_TILES.asItem());
    tab.accept(COBBLESTONE_TILE_STAIRS.asItem());
    tab.accept(COBBLESTONE_TILE_SLAB.asItem());
    tab.accept(COBBLESTONE_TILE_WALL.asItem());
    tab.accept(POLISHED_MOSSY_COBBLESTONE.asItem());
    tab.accept(POLISHED_MOSSY_COBBLESTONE_STAIRS.asItem());
    tab.accept(POLISHED_MOSSY_COBBLESTONE_SLAB.asItem());
    tab.accept(POLISHED_MOSSY_COBBLESTONE_WALL.asItem());
    tab.accept(MOSSY_COBBLESTONE_TILES.asItem());
    tab.accept(MOSSY_COBBLESTONE_TILE_STAIRS.asItem());
    tab.accept(MOSSY_COBBLESTONE_TILE_SLAB.asItem());
    tab.accept(MOSSY_COBBLESTONE_TILE_WALL.asItem());
    tab.accept(INFESTED_COBBLESTONE_TILES.asItem());
    tab.accept(INFESTED_MOSSY_COBBLESTONE_TILES.asItem());
    tab.accept(INFESTED_POLISHED_COBBLESTONE.asItem());
    tab.accept(INFESTED_POLISHED_MOSSY_COBBLESTONE.asItem());
    tab.accept(MOSSY_CRACKED_STONE_BRICKS.asItem());
    tab.accept(INFESTED_MOSSY_CRACKED_STONE_BRICKS.asItem());
    tab.accept(MOSSY_CHISELED_STONE_BRICKS.asItem());
    tab.accept(INFESTED_MOSSY_CHISELED_STONE_BRICKS.asItem());
    tab.accept(STONE_TILES.asItem());
    tab.accept(INFESTED_STONE_TILES.asItem());
    tab.accept(STONE_TILE_STAIRS.asItem());
    tab.accept(STONE_TILE_SLAB.asItem());
    tab.accept(STONE_TILE_WALL.asItem());
    tab.accept(MOSSY_STONE_TILES.asItem());
    tab.accept(INFESTED_MOSSY_STONE_TILES.asItem());
    tab.accept(MOSSY_STONE_TILE_STAIRS.asItem());
    tab.accept(MOSSY_STONE_TILE_SLAB.asItem());
    tab.accept(MOSSY_STONE_TILE_WALL.asItem());
    tab.accept(POLISHED_ANDESITE_WALL.asItem());
    tab.accept(CHISELED_ANDESITE.asItem());
    tab.accept(ANDESITE_BRICKS.asItem());
    tab.accept(ANDESITE_BRICK_STAIRS.asItem());
    tab.accept(ANDESITE_BRICK_SLAB.asItem());
    tab.accept(ANDESITE_BRICK_WALL.asItem());
    tab.accept(ANDESITE_TILES.asItem());
    tab.accept(ANDESITE_TILE_STAIRS.asItem());
    tab.accept(ANDESITE_TILE_SLAB.asItem());
    tab.accept(ANDESITE_TILE_WALL.asItem());
    tab.accept(POLISHED_DIORITE_WALL.asItem());
    tab.accept(CHISELED_DIORITE.asItem());
    tab.accept(DIORITE_BRICKS.asItem());
    tab.accept(DIORITE_BRICK_STAIRS.asItem());
    tab.accept(DIORITE_BRICK_SLAB.asItem());
    tab.accept(DIORITE_BRICK_WALL.asItem());
    tab.accept(DIORITE_TILES.asItem());
    tab.accept(DIORITE_TILE_STAIRS.asItem());
    tab.accept(DIORITE_TILE_SLAB.asItem());
    tab.accept(DIORITE_TILE_WALL.asItem());
    tab.accept(POLISHED_GRANITE_WALL.asItem());
    tab.accept(CHISELED_GRANITE.asItem());
    tab.accept(GRANITE_BRICKS.asItem());
    tab.accept(GRANITE_BRICK_STAIRS.asItem());
    tab.accept(GRANITE_BRICK_SLAB.asItem());
    tab.accept(GRANITE_BRICK_WALL.asItem());
    tab.accept(GRANITE_TILES.asItem());
    tab.accept(GRANITE_TILE_STAIRS.asItem());
    tab.accept(GRANITE_TILE_SLAB.asItem());
    tab.accept(GRANITE_TILE_WALL.asItem());
    tab.accept(DRIPSTONE_STAIRS.asItem());
    tab.accept(DRIPSTONE_SLAB.asItem());
    tab.accept(DRIPSTONE_WALL.asItem());
    tab.accept(POLISHED_DRIPSTONE.asItem());
    tab.accept(POLISHED_DRIPSTONE_STAIRS.asItem());
    tab.accept(POLISHED_DRIPSTONE_SLAB.asItem());
    tab.accept(POLISHED_DRIPSTONE_WALL.asItem());
    tab.accept(CHISELED_DRIPSTONE.asItem());
    tab.accept(DRIPSTONE_BRICKS.asItem());
    tab.accept(DRIPSTONE_BRICK_STAIRS.asItem());
    tab.accept(DRIPSTONE_BRICK_SLAB.asItem());
    tab.accept(DRIPSTONE_BRICK_WALL.asItem());
    tab.accept(DRIPSTONE_TILES.asItem());
    tab.accept(DRIPSTONE_TILE_STAIRS.asItem());
    tab.accept(DRIPSTONE_TILE_SLAB.asItem());
    tab.accept(DRIPSTONE_TILE_WALL.asItem());
    tab.accept(PRISMARINE_BRICK_WALL.asItem());
    tab.accept(DARK_PRISMARINE_WALL.asItem());
    tab.accept(SMOOTH_SANDSTONE_WALL.asItem());
    tab.accept(CUT_SANDSTONE_STAIRS.asItem());
    tab.accept(CUT_SANDSTONE_WALL.asItem());
    tab.accept(SANDSTONE_BRICKS.asItem());
    tab.accept(SANDSTONE_BRICK_STAIRS.asItem());
    tab.accept(SANDSTONE_BRICK_SLAB.asItem());
    tab.accept(SANDSTONE_BRICK_WALL.asItem());
    tab.accept(SANDSTONE_TILES.asItem());
    tab.accept(SANDSTONE_TILE_STAIRS.asItem());
    tab.accept(SANDSTONE_TILE_SLAB.asItem());
    tab.accept(SANDSTONE_TILE_WALL.asItem());
    tab.accept(SMOOTH_RED_SANDSTONE_WALL.asItem());
    tab.accept(CUT_RED_SANDSTONE_STAIRS.asItem());
    tab.accept(CUT_RED_SANDSTONE_WALL.asItem());
    tab.accept(RED_SANDSTONE_BRICKS.asItem());
    tab.accept(RED_SANDSTONE_BRICK_STAIRS.asItem());
    tab.accept(RED_SANDSTONE_BRICK_SLAB.asItem());
    tab.accept(RED_SANDSTONE_BRICK_WALL.asItem());
    tab.accept(RED_SANDSTONE_TILES.asItem());
    tab.accept(RED_SANDSTONE_TILE_STAIRS.asItem());
    tab.accept(RED_SANDSTONE_TILE_SLAB.asItem());
    tab.accept(RED_SANDSTONE_TILE_WALL.asItem());
    tab.accept(DEEPSLATE_STAIRS.asItem());
    tab.accept(DEEPSLATE_SLAB.asItem());
    tab.accept(DEEPSLATE_WALL.asItem());
    tab.accept(TUFF_TILES.asItem());
    tab.accept(TUFF_TILE_STAIRS.asItem());
    tab.accept(TUFF_TILE_SLAB.asItem());
    tab.accept(TUFF_TILE_WALL.asItem());
    tab.accept(CALCITE_STAIRS.asItem());
    tab.accept(CALCITE_SLAB.asItem());
    tab.accept(CALCITE_WALL.asItem());
    tab.accept(CHISELED_CALCITE.asItem());
    tab.accept(POLISHED_CALCITE.asItem());
    tab.accept(POLISHED_CALCITE_STAIRS.asItem());
    tab.accept(POLISHED_CALCITE_SLAB.asItem());
    tab.accept(POLISHED_CALCITE_WALL.asItem());
    tab.accept(CALCITE_BRICKS.asItem());
    tab.accept(CALCITE_BRICK_STAIRS.asItem());
    tab.accept(CALCITE_BRICK_SLAB.asItem());
    tab.accept(CALCITE_BRICK_WALL.asItem());
    tab.accept(CALCITE_TILES.asItem());
    tab.accept(CALCITE_TILE_STAIRS.asItem());
    tab.accept(CALCITE_TILE_SLAB.asItem());
    tab.accept(CALCITE_TILE_WALL.asItem());
    tab.accept(PACKED_MUD_STAIRS.asItem());
    tab.accept(PACKED_MUD_SLAB.asItem());
    tab.accept(PACKED_MUD_WALL.asItem());
    tab.accept(MUD_TILES.asItem());
    tab.accept(MUD_TILE_STAIRS.asItem());
    tab.accept(MUD_TILE_SLAB.asItem());
    tab.accept(MUD_TILE_WALL.asItem());
    tab.accept(CHISELED_MUD_BRICKS.asItem());
    tab.accept(SMOOTH_MUD.asItem());
    tab.accept(SMOOTH_MUD_STAIRS.asItem());
    tab.accept(SMOOTH_MUD_SLAB.asItem());
    tab.accept(SMOOTH_MUD_WALL.asItem());
    tab.accept(CHISELED_OBSIDIAN.asItem());
    tab.accept(POLISHED_OBSIDIAN.asItem());
    tab.accept(POLISHED_OBSIDIAN_STAIRS.asItem());
    tab.accept(POLISHED_OBSIDIAN_SLAB.asItem());
    tab.accept(POLISHED_OBSIDIAN_WALL.asItem());
    tab.accept(OBSIDIAN_BRICKS.asItem());
    tab.accept(OBSIDIAN_BRICK_STAIRS.asItem());
    tab.accept(OBSIDIAN_BRICK_SLAB.asItem());
    tab.accept(OBSIDIAN_BRICK_WALL.asItem());
    tab.accept(OBSIDIAN_TILES.asItem());
    tab.accept(OBSIDIAN_TILE_STAIRS.asItem());
    tab.accept(OBSIDIAN_TILE_SLAB.asItem());
    tab.accept(OBSIDIAN_TILE_WALL.asItem());
    tab.accept(CRACKED_RED_NETHER_BRICKS.asItem());
    tab.accept(CHISELED_RED_NETHER_BRICKS.asItem());
    tab.accept(RED_NETHER_BRICK_FENCE.asItem());
    tab.accept(END_STONE_STAIRS.asItem());
    tab.accept(END_STONE_SLAB.asItem());
    tab.accept(END_STONE_WALL.asItem());
    tab.accept(CHISELED_END_STONE.asItem());
    tab.accept(POLISHED_END_STONE.asItem());
    tab.accept(POLISHED_END_STONE_STAIRS.asItem());
    tab.accept(POLISHED_END_STONE_SLAB.asItem());
    tab.accept(POLISHED_END_STONE_WALL.asItem());
    tab.accept(END_STONE_TILES.asItem());
    tab.accept(END_STONE_TILE_STAIRS.asItem());
    tab.accept(END_STONE_TILE_SLAB.asItem());
    tab.accept(END_STONE_TILE_WALL.asItem());
    tab.accept(CHISELED_PURPUR.asItem());
    tab.accept(POLISHED_PURPUR.asItem());
    tab.accept(POLISHED_PURPUR_STAIRS.asItem());
    tab.accept(POLISHED_PURPUR_SLAB.asItem());
    tab.accept(POLISHED_PURPUR_WALL.asItem());
    tab.accept(PURPUR_BRICKS.asItem());
    tab.accept(PURPUR_BRICK_STAIRS.asItem());
    tab.accept(PURPUR_BRICK_SLAB.asItem());
    tab.accept(PURPUR_BRICK_WALL.asItem());
    tab.accept(PURPUR_TILE_WALL.asItem());
    tab.accept(BLACKSTONE_TILES.asItem());
    tab.accept(BLACKSTONE_TILE_STAIRS.asItem());
    tab.accept(BLACKSTONE_TILE_SLAB.asItem());
    tab.accept(BLACKSTONE_TILE_WALL.asItem());
    tab.accept(SMOOTH_BASALT_STAIRS.asItem());
    tab.accept(SMOOTH_BASALT_SLAB.asItem());
    tab.accept(SMOOTH_BASALT_WALL.asItem());
    tab.accept(POLISHED_SMOOTH_BASALT.asItem());
    tab.accept(POLISHED_SMOOTH_BASALT_STAIRS.asItem());
    tab.accept(POLISHED_SMOOTH_BASALT_SLAB.asItem());
    tab.accept(POLISHED_SMOOTH_BASALT_WALL.asItem());
    tab.accept(SMOOTH_BASALT_BRICKS.asItem());
    tab.accept(SMOOTH_BASALT_BRICK_STAIRS.asItem());
    tab.accept(SMOOTH_BASALT_BRICK_SLAB.asItem());
    tab.accept(SMOOTH_BASALT_BRICK_WALL.asItem());
    tab.accept(CRACKED_SMOOTH_BASALT_BRICKS.asItem());
    tab.accept(CHISELED_SMOOTH_BASALT.asItem());
    tab.accept(SMOOTH_BASALT_TILES.asItem());
    tab.accept(SMOOTH_BASALT_TILE_STAIRS.asItem());
    tab.accept(SMOOTH_BASALT_TILE_SLAB.asItem());
    tab.accept(SMOOTH_BASALT_TILE_WALL.asItem());
    tab.accept(PACKED_SNOW.asItem());
    tab.accept(PACKED_SNOW_STAIRS.asItem());
    tab.accept(PACKED_SNOW_SLAB.asItem());
    tab.accept(PACKED_SNOW_WALL.asItem());
    tab.accept(SNOW_BRICKS.asItem());
    tab.accept(SNOW_BRICK_STAIRS.asItem());
    tab.accept(SNOW_BRICK_SLAB.asItem());
    tab.accept(SNOW_BRICK_WALL.asItem());
    tab.accept(POLISHED_ICE.asItem());
    tab.accept(POLISHED_ICE_STAIRS.asItem());
    tab.accept(POLISHED_ICE_SLAB.asItem());
    tab.accept(POLISHED_ICE_WALL.asItem());
    tab.accept(ICE_BRICKS.asItem());
    tab.accept(ICE_BRICK_STAIRS.asItem());
    tab.accept(ICE_BRICK_SLAB.asItem());
    tab.accept(ICE_BRICK_WALL.asItem());
    tab.accept(ICE_TILES.asItem());
    tab.accept(ICE_TILE_STAIRS.asItem());
    tab.accept(ICE_TILE_SLAB.asItem());
    tab.accept(ICE_TILE_WALL.asItem());
    tab.accept(CHISELED_ICE.asItem());
    tab.accept(POLISHED_PACKED_ICE.asItem());
    tab.accept(POLISHED_PACKED_ICE_STAIRS.asItem());
    tab.accept(POLISHED_PACKED_ICE_SLAB.asItem());
    tab.accept(POLISHED_PACKED_ICE_WALL.asItem());
    tab.accept(PACKED_ICE_BRICKS.asItem());
    tab.accept(PACKED_ICE_BRICK_STAIRS.asItem());
    tab.accept(PACKED_ICE_BRICK_SLAB.asItem());
    tab.accept(PACKED_ICE_BRICK_WALL.asItem());
    tab.accept(PACKED_ICE_TILES.asItem());
    tab.accept(PACKED_ICE_TILE_STAIRS.asItem());
    tab.accept(PACKED_ICE_TILE_SLAB.asItem());
    tab.accept(PACKED_ICE_TILE_WALL.asItem());
    tab.accept(CHISELED_PACKED_ICE.asItem());
    tab.accept(POLISHED_BLUE_ICE.asItem());
    tab.accept(POLISHED_BLUE_ICE_STAIRS.asItem());
    tab.accept(POLISHED_BLUE_ICE_SLAB.asItem());
    tab.accept(POLISHED_BLUE_ICE_WALL.asItem());
    tab.accept(BLUE_ICE_BRICKS.asItem());
    tab.accept(BLUE_ICE_BRICK_STAIRS.asItem());
    tab.accept(BLUE_ICE_BRICK_SLAB.asItem());
    tab.accept(BLUE_ICE_BRICK_WALL.asItem());
    tab.accept(BLUE_ICE_TILES.asItem());
    tab.accept(BLUE_ICE_TILE_STAIRS.asItem());
    tab.accept(BLUE_ICE_TILE_SLAB.asItem());
    tab.accept(BLUE_ICE_TILE_WALL.asItem());
    tab.accept(CHISELED_BLUE_ICE.asItem());
    tab.accept(WHITE_THREADED_WOOL.asItem());
    tab.accept(WHITE_THREADED_CARPET.asItem());
    tab.accept(LIGHT_GRAY_THREADED_WOOL.asItem());
    tab.accept(LIGHT_GRAY_THREADED_CARPET.asItem());
    tab.accept(GRAY_THREADED_WOOL.asItem());
    tab.accept(GRAY_THREADED_CARPET.asItem());
    tab.accept(BLACK_THREADED_WOOL.asItem());
    tab.accept(BLACK_THREADED_CARPET.asItem());
    tab.accept(BROWN_THREADED_WOOL.asItem());
    tab.accept(BROWN_THREADED_CARPET.asItem());
    tab.accept(RED_THREADED_WOOL.asItem());
    tab.accept(RED_THREADED_CARPET.asItem());
    tab.accept(ORANGE_THREADED_WOOL.asItem());
    tab.accept(ORANGE_THREADED_CARPET.asItem());
    tab.accept(YELLOW_THREADED_WOOL.asItem());
    tab.accept(YELLOW_THREADED_CARPET.asItem());
    tab.accept(LIME_THREADED_WOOL.asItem());
    tab.accept(LIME_THREADED_CARPET.asItem());
    tab.accept(GREEN_THREADED_WOOL.asItem());
    tab.accept(GREEN_THREADED_CARPET.asItem());
    tab.accept(CYAN_THREADED_WOOL.asItem());
    tab.accept(CYAN_THREADED_CARPET.asItem());
    tab.accept(LIGHT_BLUE_THREADED_WOOL.asItem());
    tab.accept(LIGHT_BLUE_THREADED_CARPET.asItem());
    tab.accept(BLUE_THREADED_WOOL.asItem());
    tab.accept(BLUE_THREADED_CARPET.asItem());
    tab.accept(PURPLE_THREADED_WOOL.asItem());
    tab.accept(PURPLE_THREADED_CARPET.asItem());
    tab.accept(MAGENTA_THREADED_WOOL.asItem());
    tab.accept(MAGENTA_THREADED_CARPET.asItem());
    tab.accept(PINK_THREADED_WOOL.asItem());
    tab.accept(PINK_THREADED_CARPET.asItem());
    tab.accept(TERRACOTTA_STAIRS.asItem());
    tab.accept(TERRACOTTA_SLAB.asItem());
    tab.accept(TERRACOTTA_WALL.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_STAIRS.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_SLAB.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_WALL.asItem());
    tab.accept(GRAY_TERRACOTTA_STAIRS.asItem());
    tab.accept(GRAY_TERRACOTTA_SLAB.asItem());
    tab.accept(GRAY_TERRACOTTA_WALL.asItem());
    tab.accept(BLACK_TERRACOTTA_STAIRS.asItem());
    tab.accept(BLACK_TERRACOTTA_SLAB.asItem());
    tab.accept(BLACK_TERRACOTTA_WALL.asItem());
    tab.accept(WHITE_TERRACOTTA_STAIRS.asItem());
    tab.accept(WHITE_TERRACOTTA_SLAB.asItem());
    tab.accept(WHITE_TERRACOTTA_WALL.asItem());
    tab.accept(BROWN_TERRACOTTA_STAIRS.asItem());
    tab.accept(BROWN_TERRACOTTA_SLAB.asItem());
    tab.accept(BROWN_TERRACOTTA_WALL.asItem());
    tab.accept(RED_TERRACOTTA_STAIRS.asItem());
    tab.accept(RED_TERRACOTTA_SLAB.asItem());
    tab.accept(RED_TERRACOTTA_WALL.asItem());
    tab.accept(ORANGE_TERRACOTTA_STAIRS.asItem());
    tab.accept(ORANGE_TERRACOTTA_SLAB.asItem());
    tab.accept(ORANGE_TERRACOTTA_WALL.asItem());
    tab.accept(YELLOW_TERRACOTTA_STAIRS.asItem());
    tab.accept(YELLOW_TERRACOTTA_SLAB.asItem());
    tab.accept(YELLOW_TERRACOTTA_WALL.asItem());
    tab.accept(LIME_TERRACOTTA_STAIRS.asItem());
    tab.accept(LIME_TERRACOTTA_SLAB.asItem());
    tab.accept(LIME_TERRACOTTA_WALL.asItem());
    tab.accept(GREEN_TERRACOTTA_STAIRS.asItem());
    tab.accept(GREEN_TERRACOTTA_SLAB.asItem());
    tab.accept(GREEN_TERRACOTTA_WALL.asItem());
    tab.accept(CYAN_TERRACOTTA_STAIRS.asItem());
    tab.accept(CYAN_TERRACOTTA_SLAB.asItem());
    tab.accept(CYAN_TERRACOTTA_WALL.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_SLAB.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_WALL.asItem());
    tab.accept(BLUE_TERRACOTTA_STAIRS.asItem());
    tab.accept(BLUE_TERRACOTTA_SLAB.asItem());
    tab.accept(BLUE_TERRACOTTA_WALL.asItem());
    tab.accept(PURPLE_TERRACOTTA_STAIRS.asItem());
    tab.accept(PURPLE_TERRACOTTA_SLAB.asItem());
    tab.accept(PURPLE_TERRACOTTA_WALL.asItem());
    tab.accept(MAGENTA_TERRACOTTA_STAIRS.asItem());
    tab.accept(MAGENTA_TERRACOTTA_SLAB.asItem());
    tab.accept(MAGENTA_TERRACOTTA_WALL.asItem());
    tab.accept(PINK_TERRACOTTA_STAIRS.asItem());
    tab.accept(PINK_TERRACOTTA_SLAB.asItem());
    tab.accept(PINK_TERRACOTTA_WALL.asItem());
    tab.accept(TERRACOTTA_BRICKS.asItem());
    tab.accept(TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(WHITE_TERRACOTTA_BRICKS.asItem());
    tab.accept(WHITE_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(WHITE_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(WHITE_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_BRICKS.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(LIGHT_GRAY_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(GRAY_TERRACOTTA_BRICKS.asItem());
    tab.accept(GRAY_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(GRAY_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(GRAY_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(BLACK_TERRACOTTA_BRICKS.asItem());
    tab.accept(BLACK_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(BLACK_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(BLACK_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(BROWN_TERRACOTTA_BRICKS.asItem());
    tab.accept(BROWN_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(BROWN_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(BROWN_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(RED_TERRACOTTA_BRICKS.asItem());
    tab.accept(RED_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(RED_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(RED_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(ORANGE_TERRACOTTA_BRICKS.asItem());
    tab.accept(ORANGE_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(ORANGE_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(ORANGE_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(YELLOW_TERRACOTTA_BRICKS.asItem());
    tab.accept(YELLOW_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(YELLOW_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(YELLOW_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(LIME_TERRACOTTA_BRICKS.asItem());
    tab.accept(LIME_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(LIME_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(LIME_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(GREEN_TERRACOTTA_BRICKS.asItem());
    tab.accept(GREEN_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(GREEN_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(GREEN_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(CYAN_TERRACOTTA_BRICKS.asItem());
    tab.accept(CYAN_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(CYAN_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(CYAN_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_BRICKS.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(LIGHT_BLUE_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(BLUE_TERRACOTTA_BRICKS.asItem());
    tab.accept(BLUE_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(BLUE_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(BLUE_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(PURPLE_TERRACOTTA_BRICKS.asItem());
    tab.accept(PURPLE_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(PURPLE_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(PURPLE_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(MAGENTA_TERRACOTTA_BRICKS.asItem());
    tab.accept(MAGENTA_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(MAGENTA_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(MAGENTA_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(PINK_TERRACOTTA_BRICKS.asItem());
    tab.accept(PINK_TERRACOTTA_BRICK_STAIRS.asItem());
    tab.accept(PINK_TERRACOTTA_BRICK_SLAB.asItem());
    tab.accept(PINK_TERRACOTTA_BRICK_WALL.asItem());
    tab.accept(WHITE_CONCRETE_STAIRS.asItem());
    tab.accept(WHITE_CONCRETE_SLAB.asItem());
    tab.accept(WHITE_CONCRETE_WALL.asItem());
    tab.accept(LIGHT_GRAY_CONCRETE_STAIRS.asItem());
    tab.accept(LIGHT_GRAY_CONCRETE_SLAB.asItem());
    tab.accept(LIGHT_GRAY_CONCRETE_WALL.asItem());
    tab.accept(GRAY_CONCRETE_STAIRS.asItem());
    tab.accept(GRAY_CONCRETE_SLAB.asItem());
    tab.accept(GRAY_CONCRETE_WALL.asItem());
    tab.accept(BLACK_CONCRETE_STAIRS.asItem());
    tab.accept(BLACK_CONCRETE_SLAB.asItem());
    tab.accept(BLACK_CONCRETE_WALL.asItem());
    tab.accept(BROWN_CONCRETE_STAIRS.asItem());
    tab.accept(BROWN_CONCRETE_SLAB.asItem());
    tab.accept(BROWN_CONCRETE_WALL.asItem());
    tab.accept(RED_CONCRETE_STAIRS.asItem());
    tab.accept(RED_CONCRETE_SLAB.asItem());
    tab.accept(RED_CONCRETE_WALL.asItem());
    tab.accept(ORANGE_CONCRETE_STAIRS.asItem());
    tab.accept(ORANGE_CONCRETE_SLAB.asItem());
    tab.accept(ORANGE_CONCRETE_WALL.asItem());
    tab.accept(YELLOW_CONCRETE_STAIRS.asItem());
    tab.accept(YELLOW_CONCRETE_SLAB.asItem());
    tab.accept(YELLOW_CONCRETE_WALL.asItem());
    tab.accept(LIME_CONCRETE_STAIRS.asItem());
    tab.accept(LIME_CONCRETE_SLAB.asItem());
    tab.accept(LIME_CONCRETE_WALL.asItem());
    tab.accept(GREEN_CONCRETE_STAIRS.asItem());
    tab.accept(GREEN_CONCRETE_SLAB.asItem());
    tab.accept(GREEN_CONCRETE_WALL.asItem());
    tab.accept(CYAN_CONCRETE_STAIRS.asItem());
    tab.accept(CYAN_CONCRETE_SLAB.asItem());
    tab.accept(CYAN_CONCRETE_WALL.asItem());
    tab.accept(LIGHT_BLUE_CONCRETE_STAIRS.asItem());
    tab.accept(LIGHT_BLUE_CONCRETE_SLAB.asItem());
    tab.accept(LIGHT_BLUE_CONCRETE_WALL.asItem());
    tab.accept(BLUE_CONCRETE_STAIRS.asItem());
    tab.accept(BLUE_CONCRETE_SLAB.asItem());
    tab.accept(BLUE_CONCRETE_WALL.asItem());
    tab.accept(PURPLE_CONCRETE_STAIRS.asItem());
    tab.accept(PURPLE_CONCRETE_SLAB.asItem());
    tab.accept(PURPLE_CONCRETE_WALL.asItem());
    tab.accept(MAGENTA_CONCRETE_STAIRS.asItem());
    tab.accept(MAGENTA_CONCRETE_SLAB.asItem());
    tab.accept(MAGENTA_CONCRETE_WALL.asItem());
    tab.accept(PINK_CONCRETE_STAIRS.asItem());
    tab.accept(PINK_CONCRETE_SLAB.asItem());
    tab.accept(PINK_CONCRETE_WALL.asItem());

//$tabRegistration:end
        });
    }

}

package com.bountiful.blocks.blocks;

import com.bountiful.blocks.NewBountifulBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ModBlockTypes {
    static public void register() {}

    // ----- BLOCKSET TYPES ----- //
    public static final BlockSetType MUD = registerBlockSetType("mud",
            BlockSetTypeBuilder.copyOf(BlockSetType.POLISHED_BLACKSTONE)
                    .pressurePlateClickOnSound(SoundEvents.MUD_BRICKS_STEP)
                    .pressurePlateClickOffSound(SoundEvents.MUD_BRICKS_STEP)
                    .buttonClickOnSound(SoundEvents.MUD_BRICKS_STEP)
                    .buttonClickOffSound(SoundEvents.MUD_BRICKS_STEP)
    );



    // ----- REGISTRATION ----- //
    public static BlockSetType registerBlockSetType(String name, BlockSetTypeBuilder blockSetTypeBuilder)
    {
        return blockSetTypeBuilder.build(NewBountifulBlocks.id(name));
    }

}

package com.bountiful.blocks.blocks.custum;

import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MudPressurePlateBlock extends PressurePlateBlock {

    public MudPressurePlateBlock(BlockSetType type, Properties properties) {
        super(type, properties);
    }

    @Override
    protected int getPressedTime() {
        return 60;
    }
}

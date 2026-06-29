package com.bountiful.blocks.blocks.custum;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class CarvedSnowBlock extends Block {

    public static final Property<Direction> FACING = BlockStateProperties.FACING;
    public static final BooleanProperty CARVED = BooleanProperty.create("carved");

    public static final MapCodec<CarvedSnowBlock> CODEC = CarvedSnowBlock.simpleCodec(CarvedSnowBlock::new);

    public MapCodec<CarvedSnowBlock> getCodec() {
        return CODEC;
    }

    public CarvedSnowBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING,CARVED);
        super.createBlockStateDefinition(builder);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(CARVED, false);
    }


    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!itemStack.is(ItemTags.SHOVELS)) {
            return super.useItemOn(itemStack, state, level, pos, player, hand, hitResult);
        } else if (level instanceof ServerLevel) {
            Direction clickedDirection = hitResult.getDirection();
            Direction direction = hitResult.getDirection();
            level.playSound(null, pos, SoundEvents.SNOW_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.setBlock(pos, this.defaultBlockState().setValue(FACING, direction).setValue(CARVED,true), 11);
            itemStack.hurtAndBreak(1, player, hand.asEquipmentSlot());
            level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.SUCCESS;
        }
    }


}
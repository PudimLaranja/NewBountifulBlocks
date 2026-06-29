package com.bountiful.blocks.mixin;

import com.bountiful.blocks.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.PortalProcessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.portal.PortalShape;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Debug(export = true)
@Mixin(PortalShape.class)
public class NetherPortalMixin {


    @Shadow(remap = true)
    @Final
    @Mutable
    private static BlockBehaviour.StatePredicate FRAME;

    @Inject(method = "<init>",at = @At("TAIL"))
    private void NetherPortal(Direction.Axis axis, int portalBlockCount, Direction rightDir, BlockPos bottomLeft, int width, int height, CallbackInfo ci) {
        FRAME = (state, world, pos) -> state.is(ModTags.Blocks.NETHER_PORTAL_FRAMES);
    }
}
package com.bountiful.blocks.mixin;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

import static com.bountiful.blocks.NewBountifulBlocks.CARVABLE_PLANKS;

@Debug(export = true)
@Mixin(AxeItem.class)
public class AxeItemMixin {

	@Inject(method = "getStripped", at = @At("HEAD"), cancellable = true)
	private void getStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {

		if (CARVABLE_PLANKS.containsKey(state.getBlock())) {
			cir.setReturnValue(Optional.of(CARVABLE_PLANKS.get(state.getBlock()).defaultBlockState()));
		}
	}
}

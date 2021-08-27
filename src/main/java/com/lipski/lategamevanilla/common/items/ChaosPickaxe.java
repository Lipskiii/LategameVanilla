package com.lipski.lategamevanilla.common.items;

import com.lipski.lategamevanilla.LategameVanillaMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class ChaosPickaxe extends AxeItem {
    public ChaosPickaxe(Tier p_42961_, int p_42962_, float p_42963_, Properties p_42964_) {
        super(p_42961_, p_42962_, p_42963_, p_42964_);
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pEntityLiving) {

        if (!pLevel.isClientSide && pState.getDestroySpeed(pLevel, pPos) != 0.0F) {
            pStack.hurtAndBreak(1, pEntityLiving, (p_40992_) -> {
                p_40992_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });
        }


        increaseBlocksBroken(pStack);


        LategameVanillaMod.LOGGER.info(pStack.getOrCreateTag().getInt("blocksBroken"));
        //pLevel.setBlock(pPos, BlockInit.BEAN_BLOCK.get().defaultBlockState(), 2,10);

        return true;
    }

    private void increaseBlocksBroken(ItemStack pStack) {
        if(pStack.getOrCreateTag().getInt("blocksBroken") == 0){
            pStack.getOrCreateTag().putInt("blocksBroken",1);
        }else{
            pStack.getOrCreateTag().putInt("blocksBroken", pStack.getOrCreateTag().getInt("blocksBroken") + 1);
        }
    }
}

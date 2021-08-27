package com.lipski.lategamevanilla.core.init;

import com.lipski.lategamevanilla.LategameVanillaMod;
import com.lipski.lategamevanilla.common.items.ChaosPickaxe;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            LategameVanillaMod.MOD_ID);


    public static final RegistryObject<Item> CHAOS_PICKAXE = ITEMS.register("chaos_pickaxe",
            () -> new ChaosPickaxe(Tiers.NETHERITE,5,-1.0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
}

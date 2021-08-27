package com.lipski.lategamevanilla;

import com.lipski.lategamevanilla.core.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("lategamevanilla")
public class LategameVanillaMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lategamevanilla";
    public LategameVanillaMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);


    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event){
        
    }



}

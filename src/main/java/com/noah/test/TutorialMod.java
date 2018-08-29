package com.noah.test;

import com.noah.test.item.ModItems;
import com.noah.test.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version)
public class TutorialMod {
	
	@SidedProxy(serverSide = "com.noah.test.proxy.CommonProxy", clientSide = "com.noah.test.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final String modId = "tutorial";
	public static final String name = "Tutorial Mod";
	public static final String version = "0.1";
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModItems.registerModels();
		}
		
	}

	@Mod.Instance(modId)
	public static TutorialMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}

package com.noah.test.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase ingotAluminum = new ItemBase("ingot_aluminum").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MATERIALS);

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ingotCopper,
				ingotAluminum
		);
	}
	
	public static void registerModels() {
		ingotCopper.registerItemModel();
		ingotAluminum.registerItemModel();
	}

}

package com.noah.test.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase ingotSteel = new ItemBase("ingot_steel").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotSilver = new ItemBase("ingot_silver").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotPlastic = new ItemBase("ingot_plastic").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotTitanium = new ItemBase("ingot_titanium").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotZinc = new ItemBase("ingot_zinc").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotLead = new ItemBase("ingot_lead").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotAluminum = new ItemBase("ingot_aluminum").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MATERIALS);

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ingotCopper,
				ingotAluminum,
				ingotLead,
				ingotZinc,
				ingotTitanium,
				ingotPlastic,
				ingotSilver,
				ingotSteel
		);
	}
	
	public static void registerModels() {
		ingotCopper.registerItemModel();
		ingotAluminum.registerItemModel();
		ingotLead.registerItemModel();
		ingotZinc.registerItemModel();
		ingotTitanium.registerItemModel();
		ingotPlastic.registerItemModel();
		ingotSilver.registerItemModel();
		ingotSteel.registerItemModel();
		}

}

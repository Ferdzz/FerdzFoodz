package com.ferdz.foodz;

import com.ferdz.foodz.item.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = FerdzFoodz.MODID, version = FerdzFoodz.VERSION)
public class FerdzFoodz {
	public static final String MODID = "ferdzfoodz";
	public static final String VERSION = "1.0";
	
	@Mod.Instance(value = MODID)
	public static FerdzFoodz INSTANCE;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Started loading " + MODID + " version " + VERSION);
		
		/* ====== INIT ITEMS ====== */
		ModItems.initItems();
		/* ====== INIT CRAFTING RECIPES ====== */
		ModItems.initCrafting();
		/* ======= INIT LISTENERS ======*/
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Loaded " + MODID + " version " + VERSION + " correctly");
	}
}

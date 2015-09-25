package com.ferdz.foodz.item;

import com.ferdz.foodz.FerdzFoodz;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {
	
	public static Item applePie;
	
	public static Item carrotJuice;
	public static Item appleJuice;
	public static Item watermelonJuice;
	public static Item pumpkinJuice;
	
	public static void initItems() {
		applePie = new ItemFood(8, 0.6F, false).setUnlocalizedName("applePie").setTextureName(FerdzFoodz.MODID + ":applePie");
		
		carrotJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("carrotJuice").setTextureName(FerdzFoodz.MODID + ":carrotJuice");
		appleJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("appleJuice").setTextureName(FerdzFoodz.MODID + ":appleJuice");
		watermelonJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("watermelonJuice").setTextureName(FerdzFoodz.MODID + ":watermelonJuice");
		pumpkinJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("pumpkinJuice").setTextureName(FerdzFoodz.MODID + ":pumpkinJuice");
		
		GameRegistry.registerItem(applePie, applePie.getUnlocalizedName());
		
		GameRegistry.registerItem(carrotJuice, carrotJuice.getUnlocalizedName());
		GameRegistry.registerItem(appleJuice, appleJuice.getUnlocalizedName());
		GameRegistry.registerItem(watermelonJuice, watermelonJuice.getUnlocalizedName());
		GameRegistry.registerItem(pumpkinJuice, pumpkinJuice.getUnlocalizedName());
	}
	
	public static void initCrafting() {
		
	}
}

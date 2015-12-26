package com.ferdzfoodz.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.ferdzfoodz.FerdzFoodz;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item knife;
	
	public static Item applePie;
	
	public static Item carrotJuice;
	public static Item appleJuice;
	public static Item watermelonJuice;
	public static Item pumpkinJuice;
	
	public static Item fishAndChips;
	public static Item chickenWingsRaw;
	public static Item chickenWingsCooked;
	public static Item chickenBreastRaw;
	public static Item chickenBreastCooked;
	public static Item chickenThighsRaw;
	public static Item chickenThighsCooked;
	
	public static Item iceCreamVanilla;
	public static Item iceCreamChocolate;
	public static Item caramel;
	public static Item caramelApple;
	public static Item brownies;
	
	public static Item porkchopSandwich;
	public static Item wholeBreakfast;
	public static Item eggCooked;
	public static Item chickenPotPie;
	
	public static Item baconRaw;
	public static Item baconCooked;
	
	public static Item chocolateMilk;
	public static Item hotChocolate;
	
	public static Item chipsRaw;
	public static Item chipsCooked;
	public static Item doritos;
	public static Item corndog;
	public static Item friesRaw;
	public static Item friesCooked;
	
	public static void initItems() {
		knife = new ItemKnife().setUnlocalizedName("ferdzKnife").setTextureName(FerdzFoodz.MODID + ":knife").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabAllSearch);
		
		applePie = new ItemFood(8, 0.6F, false).setUnlocalizedName("applePie").setTextureName(FerdzFoodz.MODID + ":applePie").setCreativeTab(CreativeTabs.tabFood);
		
		carrotJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("carrotJuice").setTextureName(FerdzFoodz.MODID + ":carrotJuice").setCreativeTab(CreativeTabs.tabFood);
		appleJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("appleJuice").setTextureName(FerdzFoodz.MODID + ":appleJuice").setCreativeTab(CreativeTabs.tabFood);
		watermelonJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("watermelonJuice").setTextureName(FerdzFoodz.MODID + ":watermelonJuice").setCreativeTab(CreativeTabs.tabFood);
		pumpkinJuice = new ItemDrinkable(3, 0.8F).setUnlocalizedName("pumpkinJuice").setTextureName(FerdzFoodz.MODID + ":pumpkinJuice").setCreativeTab(CreativeTabs.tabFood);
		
		fishAndChips = new ItemFood(3, 0.8F, false).setUnlocalizedName("fishAndChips").setTextureName(FerdzFoodz.MODID + ":fishAndChips").setCreativeTab(CreativeTabs.tabFood); // no recipe
		chickenWingsRaw = new ItemFood(2, 0.5F, false).setUnlocalizedName("chickenWingsRaw").setTextureName(FerdzFoodz.MODID + ":chickenWingsRaw").setCreativeTab(CreativeTabs.tabFood);
		chickenWingsCooked = new ItemFood(5, 1.0F, false).setUnlocalizedName("chickenWingsCooked").setTextureName(FerdzFoodz.MODID + ":chickenWingsCooked").setCreativeTab(CreativeTabs.tabFood);
		chickenBreastRaw = new ItemFood(2, 0.5F, false).setUnlocalizedName("chickenBreastRaw").setTextureName(FerdzFoodz.MODID + ":chickenBreastRaw").setCreativeTab(CreativeTabs.tabFood);
		chickenBreastCooked = new ItemFood(5, 1.0F, false).setUnlocalizedName("chickenBreastCooked").setTextureName(FerdzFoodz.MODID + ":chickenBreastCooked").setCreativeTab(CreativeTabs.tabFood);
		chickenThighsRaw = new ItemFood(2, 0.5F, false).setUnlocalizedName("chickenThighsRaw").setTextureName(FerdzFoodz.MODID + ":chickenThighsRaw").setCreativeTab(CreativeTabs.tabFood);
		chickenThighsCooked = new ItemFood(5, 1.0F, false).setUnlocalizedName("chickenThighsCooked").setTextureName(FerdzFoodz.MODID + ":chickenThighsCooked").setCreativeTab(CreativeTabs.tabFood);
		
		iceCreamVanilla = new ItemFood(3, 0.5F, false).setUnlocalizedName("iceCreamVanilla").setTextureName(FerdzFoodz.MODID + ":iceCreamVanilla").setCreativeTab(CreativeTabs.tabFood);
		iceCreamChocolate = new ItemFood(3, 0.5F, false).setUnlocalizedName("iceCreamChocolate").setTextureName(FerdzFoodz.MODID + ":iceCreamChocolate").setCreativeTab(CreativeTabs.tabFood);
		caramel = new ItemFood(1, 0.2F, false).setUnlocalizedName("caramel").setTextureName(FerdzFoodz.MODID + ":caramel").setCreativeTab(CreativeTabs.tabFood);
		caramelApple = new ItemFood(4, 0.6F, false).setUnlocalizedName("caramelApple").setTextureName(FerdzFoodz.MODID + ":caramelApple").setCreativeTab(CreativeTabs.tabFood);
		brownies = new ItemFood(4, 0.6F, false).setUnlocalizedName("brownies").setTextureName(FerdzFoodz.MODID + ":brownies").setCreativeTab(CreativeTabs.tabFood); //TODO: Weed brownies?
		
		porkchopSandwich = new ItemFood(8, 1.2F, false).setUnlocalizedName("porkchopSandwich").setTextureName(FerdzFoodz.MODID + ":porkchopSandwich").setCreativeTab(CreativeTabs.tabFood);
		wholeBreakfast = new ItemFood(8, 1.2F, false).setUnlocalizedName("wholeBreakfast").setTextureName(FerdzFoodz.MODID + ":wholeBreakfast").setCreativeTab(CreativeTabs.tabFood);
		eggCooked = new ItemFood(2, 0.5F, false).setUnlocalizedName("eggCooked").setTextureName(FerdzFoodz.MODID + ":eggCooked").setCreativeTab(CreativeTabs.tabFood);
		chickenPotPie = new ItemFood(8, 1.2F, false).setUnlocalizedName("chickenPotPie").setTextureName(FerdzFoodz.MODID + ":chickenPotPie").setCreativeTab(CreativeTabs.tabFood);
		
		baconRaw = new ItemFood(2, 0.4F, true).setUnlocalizedName("baconRaw").setTextureName(FerdzFoodz.MODID + ":baconRaw").setCreativeTab(CreativeTabs.tabFood);
		baconCooked = new ItemFood(4, 0.6F, true).setUnlocalizedName("baconCooked").setTextureName(FerdzFoodz.MODID + ":baconCooked").setCreativeTab(CreativeTabs.tabFood);
		
		chocolateMilk = new ItemDrinkable(2, 0.5F).setUnlocalizedName("chocolateMilk").setTextureName(FerdzFoodz.MODID + ":chocolateMilk").setCreativeTab(CreativeTabs.tabFood);
		hotChocolate = new ItemDrinkable(2, 0.6F).setUnlocalizedName("hotChocolate").setTextureName(FerdzFoodz.MODID + ":hotChocolate").setCreativeTab(CreativeTabs.tabFood);
		
		doritos = new ItemDoritos(4, 0.6F, true).setUnlocalizedName("doritos").setTextureName(FerdzFoodz.MODID + ":doritos").setCreativeTab(CreativeTabs.tabFood);
		chipsRaw = new ItemFood(1, 0.2F, true).setUnlocalizedName("chipsRaw").setTextureName(FerdzFoodz.MODID + ":chipsRaw").setCreativeTab(CreativeTabs.tabFood);
		chipsCooked = new ItemFood(2, 0.5F, true).setUnlocalizedName("chipsCooked").setTextureName(FerdzFoodz.MODID + ":chipsCooked").setCreativeTab(CreativeTabs.tabFood);
		corndog = new ItemFood(5, 0.4F, true).setUnlocalizedName("corndog").setTextureName(FerdzFoodz.MODID + ":corndog").setCreativeTab(CreativeTabs.tabFood);
		friesRaw = new ItemFood(1, 0.2F, true).setUnlocalizedName("friesRaw").setTextureName(FerdzFoodz.MODID + ":friesRaw").setCreativeTab(CreativeTabs.tabFood); // TODO: Find recipes so it doesn't overlap with chips
		friesCooked = new ItemFood(2, 0.3F, true).setUnlocalizedName("friesCooked").setTextureName(FerdzFoodz.MODID + ":friesCooked").setCreativeTab(CreativeTabs.tabFood);
		
		/* Registery */
		registerItem(knife);
		
		registerItem(applePie);
		
		registerItem(carrotJuice);
		registerItem(appleJuice);
		registerItem(watermelonJuice);
		registerItem(pumpkinJuice);
		
		registerItem(fishAndChips);
		registerItem(chickenWingsRaw);
		registerItem(chickenWingsCooked);
		registerItem(chickenBreastRaw);
		registerItem(chickenBreastCooked);
		registerItem(chickenThighsRaw);
		registerItem(chickenThighsCooked);
		
		registerItem(iceCreamVanilla);
		registerItem(iceCreamChocolate);
		registerItem(caramel);
		registerItem(caramelApple);
		registerItem(brownies);
		
		registerItem(porkchopSandwich);
		registerItem(wholeBreakfast);
		registerItem(eggCooked);
		registerItem(chickenPotPie);
		
		registerItem(baconRaw);
		registerItem(baconCooked);
		
		registerItem(chocolateMilk);
		registerItem(hotChocolate);
		
		registerItem(doritos);
		registerItem(chipsCooked);
		registerItem(chipsRaw);
		registerItem(corndog);
		registerItem(friesRaw);
		registerItem(friesCooked);
	}
	
	public static void initCrafting() {
		/* Crafting */
		GameRegistry.addRecipe(new ItemStack(knife), new Object[] {
			"II ",
			"II ",
			" S ",
			'I', Items.iron_ingot,
			'S', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(porkchopSandwich), new Object[] {
			"B",
			"P",
			"B",
			'B', Items.bread,
			'P', Items.cooked_porkchop
		});
		
		/* Shapeless */
		GameRegistry.addShapelessRecipe(new ItemStack(iceCreamVanilla), new Object[] {
			Items.bowl,
			Items.snowball,
			Items.milk_bucket
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(iceCreamChocolate), new Object[] {
			Items.bowl,
			Items.snowball,
			Items.milk_bucket,
			new ItemStack(Items.dye, 1, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(iceCreamChocolate), new Object[] {
			iceCreamVanilla,
			new ItemStack(Items.dye, 1, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(chocolateMilk), new Object[] {
			Items.milk_bucket,
			new ItemStack(Items.dye, 1 ,3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(wholeBreakfast), new Object[] {
			eggCooked,
			new ItemStack(baconCooked, 2),
			Items.bread
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(doritos), new Object[] {
			chipsCooked,
			new ItemStack(Items.dye, 1, 14)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(chipsRaw), new Object[] {
			Items.potato,
			knife
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(corndog), new Object[] {
			Items.rotten_flesh,
			Items.stick,
			Items.bread
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(brownies), new Object[] {
			new ItemStack(Items.dye, 3, 3),
			Items.sugar,
			Items.wheat,
			new ItemStack(Items.egg, 2)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(chickenPotPie), new Object[] {
			Items.carrot,
			Items.potato,
			Items.wheat,
			chickenBreastCooked,
			Blocks.brown_mushroom_block
		});
		
		/* Smelting */ 
		addSmelting(chickenWingsRaw, chickenWingsCooked);
		addSmelting(chickenBreastRaw,chickenBreastCooked);
		addSmelting(chickenThighsRaw,chickenThighsCooked);
		addSmelting(Items.sugar, caramel);
		addSmelting(chocolateMilk, hotChocolate);
		addSmelting(baconRaw, baconCooked);
		addSmelting(Items.egg, eggCooked);
		addSmelting(chipsRaw, chipsCooked);
		addSmelting(friesRaw, friesCooked);
	}
	
	private static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
	}
	
	private static void addSmelting(Item input, Item output) {
		GameRegistry.addSmelting(input, new ItemStack(output), 0);
	}
}

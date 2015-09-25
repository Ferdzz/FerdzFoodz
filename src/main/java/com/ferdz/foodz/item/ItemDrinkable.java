package com.ferdz.foodz.item;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemDrinkable extends ItemFood {

	public ItemDrinkable(int healAmount) {
		super(healAmount, false);
		this.setAlwaysEdible();
	}
	
	public ItemDrinkable(int healAmount, float saturation) {
		super(healAmount, saturation, false);
		this.setAlwaysEdible();
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.drink;
	}
}

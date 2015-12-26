package com.ferdzfoodz.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemDoritos extends ItemFood {
	
	public ItemDoritos(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	
	@Override
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
		list.add("");
		list.add(EnumChatFormatting.BOLD + "" + EnumChatFormatting.AQUA + "M" + EnumChatFormatting.BLUE + "'" + EnumChatFormatting.DARK_AQUA + "l" + EnumChatFormatting.DARK_PURPLE + "a" + EnumChatFormatting.DARK_GREEN + "d" + EnumChatFormatting.RED + "y");
	}
}

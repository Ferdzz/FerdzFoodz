package com.ferdzfoodz.handler;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.ferdzfoodz.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent e) {
		if(e.entity instanceof EntityPig) {
			Random rand = new Random();
			ItemStack stack = new ItemStack(ModItems.baconRaw, rand.nextInt(3));
			EntityItem item = new EntityItem(e.entity.worldObj, e.entity.posX, e.entity.posY, e.entity.posZ, stack);
			
			e.drops.add(item);
		}
	}
}

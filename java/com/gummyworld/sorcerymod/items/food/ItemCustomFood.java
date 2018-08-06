package com.gummyworld.sorcerymod.items.food;

import com.gummyworld.sorcerymod.Main;
import com.gummyworld.sorcerymod.init.ModItems;
import com.gummyworld.sorcerymod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel 
{
	public ItemCustomFood(String name, int amount, boolean isWolfFood) 
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

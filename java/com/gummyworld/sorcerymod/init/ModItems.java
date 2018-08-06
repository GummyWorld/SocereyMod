package com.gummyworld.sorcerymod.init;

import java.util.ArrayList;
import java.util.List;

import com.gummyworld.sorcerymod.items.ItemBase;
import com.gummyworld.sorcerymod.items.food.ItemCustomFood;
import com.gummyworld.sorcerymod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MINDSTONE = EnumHelper.addToolMaterial("material_mindstone", 3, 1587, 8.0f, 5.0f, 18);
			
	//Items
	public static final Item MINDSTONE_INGOT = new ItemBase("mindstone_ingot");
	public static final Item SUNFIRE_INGOT = new ItemBase("sunfire_ingot");
	
	//Tools
	public static final ItemSword MINDSTONE_SWORD = new ToolSword("mindstone_sword", MATERIAL_MINDSTONE);
	
	//Food
	public static final Item MAGICAL_POPSICLE = new ItemCustomFood("magical_popsicle", 3, false);
}

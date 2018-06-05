package com.gummyworld.sorcerymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MindstoneBlock extends BlockBase{

	public MindstoneBlock(String name, Material material) 
	{
		super(name, material);
		// TODO Auto-generated constructor stub
		setSoundType(SoundType.METAL);
		setHardness(4.0f);
		setResistance(17.0f);
		setHarvestLevel("pickaxe",2);
		setLightLevel(12.0f);
	}

}

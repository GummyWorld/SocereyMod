package com.gummyworld.sorcerymod.init;

import java.util.ArrayList;
import java.util.List;

import com.gummyworld.sorcerymod.blocks.BlockBase;
import com.gummyworld.sorcerymod.blocks.MindstoneBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MINDSTONE_BLOCK = new MindstoneBlock("mindstone_block", Material.IRON);
}

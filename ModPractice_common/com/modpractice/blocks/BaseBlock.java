package com.modpractice.blocks;

import com.modpractice.lib.References;
import com.modpractice.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BaseBlock extends Block {

	public BaseBlock (int id) {
		super(id, Material.rock);
		this.setHardness(25.0F);
		this.setResistance(25.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Strings.BASEBLOCK_UNLOCAL);
	}
	
	@Override
	@SideOnly (Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.RESOURCE_LOCATION, Strings.BASEBLOCK_TEXTURE));
	}
	
}

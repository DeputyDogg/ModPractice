package com.modpractice.blocks;

import com.modpractice.core.helper.LocalizationHelper;
import com.modpractice.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block baseBlock;
	
	public static void init() {
		baseBlock = new BaseBlock(2600);
		GameRegistry.registerBlock(baseBlock, Strings.BASEBLOCK_NAME);
		LanguageRegistry.addName(baseBlock, LocalizationHelper.getLocalizationString(baseBlock));
	}
	
}

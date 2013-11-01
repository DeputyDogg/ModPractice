package com.modpractice.core.helper;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {
	
	public static boolean isXMLFile(String filename) {
		return filename.endsWith(".xml");
	}
	
	public static String getLocaleFromFilename(String filename) {
		return filename.substring(filename.lastIndexOf("/") + 1, filename.lastIndexOf("."));
	}
	
	public static String getLocalizationString(Block block) {
		String key = block.getUnlocalizedName() + ".name";
		return LanguageRegistry.instance().getStringLocalization(key);
	}
	
}

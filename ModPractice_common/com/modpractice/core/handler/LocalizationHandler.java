package com.modpractice.core.handler;

import com.modpractice.core.helper.LocalizationHelper;
import com.modpractice.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {

	public static void init() {
		for (String LocalizationFile : Localizations.localeFiles) {
			LanguageRegistry.instance().loadLocalization(LocalizationFile, LocalizationHelper.getLocaleFromFilename(LocalizationFile), LocalizationHelper.isXMLFile(LocalizationFile));
		}
	}
}

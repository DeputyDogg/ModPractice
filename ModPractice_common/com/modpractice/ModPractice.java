package com.modpractice;

import com.modpractice.blocks.ModBlocks;
import com.modpractice.core.handler.LocalizationHandler;
import com.modpractice.core.proxy.CommonProxy;
import com.modpractice.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(
		name = References.MODNAME,
		modid = References.MODID,
		version = References.VERSION
		)

@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = false
		)

public class ModPractice {

	@SidedProxy(
			clientSide = References.CLIENT_PROXY_LOCATION,
			serverSide = References.COMMON_PROXY_LOCATION
			)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LocalizationHandler.init();
		ModBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}

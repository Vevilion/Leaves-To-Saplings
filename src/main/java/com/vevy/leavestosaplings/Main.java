package com.vevy.leavestosaplings;

import com.vevy.leavestosaplings.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
	public class Main {
		
		@Instance
		public static Main instance;
		
		@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
		public static CommonProxy proxy;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event){
			proxy.preInit(event);
		}
		@EventHandler
		public void init(FMLInitializationEvent event){
			proxy.init(event);
		}
		@EventHandler
		public void postInit(FMLPostInitializationEvent event){
			proxy.postInit(event);
		}
		
	}

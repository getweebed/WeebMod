package com.getweebed.hypixelmod;

import com.getweebed.hypixelmod.util.Reference; 

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class WeebMod 
{
@Instance
public static WeebMod instance;

@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent event) 
{
	
}
public void Init(FMLInitializationEvent event) 
{
	
}
public void postInit(FMLPostInitializationEvent event) 
{
	
}
public void serverinit(FMLServerStartingEvent event) 
{
	
}

}

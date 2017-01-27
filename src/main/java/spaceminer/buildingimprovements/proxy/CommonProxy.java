package spaceminer.buildingimprovements.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import spaceminer.buildingimprovements.blocks.ModBlocks;
import spaceminer.buildingimprovements.item.ModItems;

public class CommonProxy {

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
	    ModBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

	}
}

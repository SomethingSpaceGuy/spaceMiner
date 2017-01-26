package spaceMiner;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import spaceMiner.item.ModItems;
import spaceMiner.proxy.CommonProxy;

@Mod(modid = buildingImprovements.modId, name = buildingImprovements.name, version = buildingImprovements.version, acceptedMinecraftVersions = "[1.10.2]")

public class buildingImprovements {
	@SidedProxy(serverSide = "spaceMiner.proxy.CommonProxy", clientSide = "spaceMiner.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "buildingImprovements";
	public static final String name = "Building Improvements";
	public static final String version = "1.0.0";
	
	@Mod.Instance(modId)
	public static buildingImprovements instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + version + " is loading!");
		ModItems.init();
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
}

package spaceminer.buildingimprovements;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import spaceminer.buildingimprovements.proxy.CommonProxy;

@Mod(modid = BuildingImprovements.MODID, name = BuildingImprovements.MODNAME, version = BuildingImprovements.MODNAME, acceptedMinecraftVersions = "[1.10.2]")

public class BuildingImprovements {
	@SidedProxy(serverSide = "spaceminer.buildingimprovements.proxy.CommonProxy", clientSide = "spaceminer.buildingimprovements.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "buildingimprovements";
	public static final String MODNAME = "Building Improvements";
	public static final String VERSION = "1.0.0";
	
	@Mod.Instance
	public static BuildingImprovements instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}

package spaceminer.buildingimprovements.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import spaceminer.buildingimprovements.blocks.ModBlocks;
import spaceminer.buildingimprovements.item.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ModItems.initModels();
		ModBlocks.initModels();
	}
}

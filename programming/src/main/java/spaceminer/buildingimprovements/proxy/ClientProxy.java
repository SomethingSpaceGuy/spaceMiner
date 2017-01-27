package spaceminer.buildingimprovements.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import spaceminer.buildingimprovements.client.render.blocks.BlockRenderRegister;
import spaceminer.buildingimprovements.item.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ModItems.initModels();
	    BlockRenderRegister.registerBlockRenderer();
	}
}

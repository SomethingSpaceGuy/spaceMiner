package spaceMiner.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import spaceMiner.buildingImprovements;
import spaceMiner.item.ModItems;

public class ClientProxy extends CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(buildingImprovements.modId + ":" + id, "inventory"));
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		
		ModItems.plasterItem.initModel();
	
	}
}

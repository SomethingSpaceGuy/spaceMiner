package spaceminer.buildingimprovements.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import spaceminer.buildingimprovements.BuildingImprovements;
import spaceminer.buildingimprovements.blocks.ModBlocks;

public class BlockRenderRegister {
	
    public static String modid = BuildingImprovements.MODID;

    public static void registerBlockRenderer() {
        reg(ModBlocks.plasterBlock);
    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}

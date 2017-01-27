package spaceminer.buildingimprovements.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block plasterBlock;
	
    public static void createBlocks() {
        GameRegistry.registerBlock(plasterBlock = new BasicBlock("plaster_block"), "plaster_block");
    }
    
}
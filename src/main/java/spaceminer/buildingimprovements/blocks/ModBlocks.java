package spaceminer.buildingimprovements.blocks;


public final class ModBlocks {
	
	public static BlockBase plasterblock;
	
    public static void init(){
    	plasterblock = new BlockBase("plasterblock");
    }
    
    public static void initModels(){
    	plasterblock.initModel();
    }
    
}
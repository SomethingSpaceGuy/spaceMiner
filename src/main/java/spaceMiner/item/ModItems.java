package spaceMiner.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static void Init() {
		
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;	
	}	
	
	public static ItemBase plasterItem;
		public static void init() {
			plasterItem = register(new ItemBase("plasterItem").setCreativeTab(CreativeTabs.MATERIALS));
		};
		
}


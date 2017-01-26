package spaceminer.buildingimprovements.item;

public class ModItems {


	public static ItemBase plasteritem;
	
		public static void init() {
			plasteritem = new ItemBase("plasteritem");
		}	

		public static void initModels(){
			plasteritem.initModel();
		}
}


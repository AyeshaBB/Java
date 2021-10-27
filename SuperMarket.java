class SuperMarket{

  public static void main(String a[]){

   String groceries[]={"Bread","Rice","Wheat","Dal"};
   String dairyProducts[]={"Milk","Curd","MilkShake","Butter","Lassi","Chees"};
   String vegitables[]={"Tomato","BitterGaurd","Pumkin","Lady's Finger","Drum Stick"};
   String snacks[]={"Chips","Chakli","Biscuits"};
   String cosmetics[]={"Lipstic","Powder","BodyLotion","Sunscreen"};
   String kitchenEssentials[]={"Cooker","Plate","Cup"};

  
	System.out.println(groceries.length);
	System.out.println(dairyProducts.length);
	System.out.println(vegitables.length);
	System.out.println(snacks.length);
	System.out.println(cosmetics.length);
	System.out.println(kitchenEssentials.length);

	System.out.println(groceries[3]+" "+groceries[1]+" "+groceries[2]+" "+groceries[0]);
	System.out.println(dairyProducts[3]+" "+dairyProducts[1]+" "+dairyProducts[2]+" "+dairyProducts[0]+" "+dairyProducts[4]+" "+dairyProducts[5]);
	System.out.println(vegitables[0]+" "+vegitables[2]+" "+vegitables[4]+" "+vegitables[3]+" "+vegitables[1]);
	System.out.println(snacks[2]+" "+snacks[1]+" "+snacks[0]);
	System.out.println(cosmetics[3]+" "+cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]);
	System.out.println(kitchenEssentials[1]+" "+kitchenEssentials[2]+" "+kitchenEssentials[0]);
	
	}

}

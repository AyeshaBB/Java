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

		for(int i=0; i<groceries.length; i++){
		System.out.println(groceries[i]);
		}

		for(int i=0; i<dairyProducts.length; i++){
		System.out.println(dairyProducts[i]);
		}

		for(int j=0; j<vegitables.length; j++){
		System.out.println(vegitables[j]);
		}

		for(int k=0; k<snacks.length; k++){
		System.out.println(snacks[k]);
		}

		for(int p=0; p<cosmetics.length; p++){
		System.out.println(cosmetics[p]);
		}

		for(int q=0; q<kitchenEssentials.length; q++){
		System.out.println(kitchenEssentials[q]);
		}
	}

}

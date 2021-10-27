class BrandFactory{

  public static void main(String a[]){

   String brands[]={"Levis","Woodland","Black Coffee","Puma"};
   String levis[]={"Belt","Jeans","Shirt","Shorts","T-Shirts","Wallets"};
   String Woodland[]={"Slippers","Shoes","Belt","Wallet","Bags"};
   String blackCoffee[]={"T-Shirt","Pants","Shirts"};
   String puma[]={"Shoes","Slippers","T-Shirts","Pants"};

  
	System.out.println(brands.length);
	System.out.println(levis.length);
	System.out.println(Woodland.length);
	System.out.println(blackCoffee.length);
	System.out.println(puma.length);

	System.out.println(brands[3]+" "+brands[1]+" "+brands[2]+" "+brands[0]);
	System.out.println(levis[3]+" "+levis[1]+" "+levis[2]+" "+levis[0]+" "+levis[4]+" "+levis[5]);
	System.out.println(Woodland[0]+" "+Woodland[2]+" "+Woodland[4]+" "+Woodland[3]+" "+Woodland[1]);
	System.out.println(blackCoffee[2]+" "+blackCoffee[1]+" "+blackCoffee[0]);
	System.out.println(puma[3]+" "+puma[0]+" "+puma[1]+" "+puma[2]);
	
	}

}

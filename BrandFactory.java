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

		for(int i=0; i<brands.length; i++){
		System.out.println(brands[i]);
		}

		for(int j=0; j<levis.length; j++){
		System.out.println(levis[j]);
		}

		for(int k=0; k<Woodland.length; k++){
		System.out.println(Woodland[k]);
		}

		for(int p=0; p<blackCoffee.length; p++){
		System.out.println(blackCoffee[p]);
		}

		for(int q=0; q<puma.length; q++){
		System.out.println(puma[q]);
		}
	
	}

}

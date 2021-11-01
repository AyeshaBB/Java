class Mobile{

  public static void main(String a[]){

   String mobileBrands[]={"Vivo","iPhone","Samsung","Nokia"};
   String vivoMobile[]={"Silver Color","ScreenTouch","32MP Camera","1000mAh Battery"};
   String iPhone[]={"Black","ScreenTouch","24MP Camera","2000mAh Battery","100000rs"};
   String samsung[]={"Golden Color","20000rs","2000mAh"};
   String nokia[]={"Silver Color","Keypad","2000rs"};
  
	System.out.println(mobileBrands.length);
	System.out.println(vivoMobile.length);
	System.out.println(iPhone.length);
	System.out.println(samsung.length);
	System.out.println(nokia.length);

		for(int i=0; i<mobileBrands.length; i++){
		System.out.println(mobileBrands[i]);
		}

		for(int j=0; j<vivoMobile.length; j++){
		System.out.println(vivoMobile[j]);
		}

		for(int k=0; k<iPhone.length; k++){
		System.out.println(iPhone[k]);
		}

		for(int p=0; p<samsung.length; p++){
		System.out.println(samsung[p]);
		}

		for(int q=0; q<nokia.length; q++){
		System.out.println(nokia[q]);
		}
	
	}

}

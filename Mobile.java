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

	System.out.println(mobileBrands[3]+" "+mobileBrands[1]+" "+mobileBrands[2]+" "+mobileBrands[0]);
	System.out.println(vivoMobile[3]+" "+vivoMobile[1]+" "+vivoMobile[2]+" "+vivoMobile[0]);
	System.out.println(iPhone[0]+" "+iPhone[2]+" "+iPhone[4]+" "+iPhone[3]+" "+iPhone[1]);
	System.out.println(samsung[2]+" "+samsung[1]+" "+samsung[0]);
	System.out.println(nokia[2]+" "+nokia[0]+" "+nokia[1]);

	
	}

}

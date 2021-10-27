class Languages{

  public static void main(String a[]){

   String states[]={"Karnataka","UP","TamilNadu","AP"};
   String languagesInKarnataka[]={"Kannada","Hindi","Konkani","Tulu","Urdu","Sanskrit"};
   String languagesInUP[]={"Hindi","Braj Basha","Awadhi","Bundeli","Urdu"};
   String languagesInTamilNadu[]={"Tamil","Kannada","Urdu"};
   String languagesInAP[]={"Telugu","Hindi","English","Urdu"};
  
	System.out.println(states.length);
	System.out.println(languagesInKarnataka.length);
	System.out.println(languagesInUP.length);
	System.out.println(languagesInTamilNadu.length);
	System.out.println(languagesInAP.length);

	System.out.println(states[3]+" "+states[1]+" "+states[2]+" "+states[0]);
	System.out.println(languagesInKarnataka[3]+" "+languagesInKarnataka[1]+" "+languagesInKarnataka[2]+" "+languagesInKarnataka[0]+" "+languagesInKarnataka[4]+" "+languagesInKarnataka[5]);
	System.out.println(languagesInUP[0]+" "+languagesInUP[2]+" "+languagesInUP[4]+" "+languagesInUP[3]+" "+languagesInUP[1]);
	System.out.println(languagesInTamilNadu[2]+" "+languagesInTamilNadu[1]+" "+languagesInTamilNadu[0]);
	System.out.println(languagesInAP[3]+" "+languagesInAP[0]+" "+languagesInAP[1]+" "+languagesInAP[2]);
	
	}

}

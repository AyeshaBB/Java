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

		for(int i=0; i<states.length; i++){
		System.out.println(states[i]);
		}

		for(int j=0; j<languagesInKarnataka.length; j++){
		System.out.println(languagesInKarnataka[j]);
		}

		for(int k=0; k<languagesInUP.length; k++){
		System.out.println(languagesInUP[k]);
		}

		for(int p=0; p<languagesInTamilNadu.length; p++){
		System.out.println(languagesInTamilNadu[p]);
		}

		for(int q=0; q<languagesInAP.length; q++){
		System.out.println(languagesInAP[q]);
		}	
	}

}

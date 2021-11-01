class TouristPlaces{

  public static void main(String a[]){

   String placesInIndia[]={"Karnataka","Delhi","Gujarat","Maharashtra"};
   String placesInKarnataka[]={"Mysore Palace","Hampi Temple","Gokarna Beach","Udupi Temple","Bangalore Palace","Chamundi Betta"};
   String placesInDelhi[]={"Red Fort","Qutab Minar","Humayun Tomb","Jama Masjid","India Gate"};
   String placesInGujarat[]={"Ahmedabad-Gandhi Ashram","Vadodara-Kirti Mandir","Gir National Park"};
   String placesInMaharashtra[]={"Gateway of Mumbai","Ajanta Caves","Ellora Caves","Elephanta Caves"};
  
	System.out.println(placesInIndia.length);
	System.out.println(placesInKarnataka.length);
	System.out.println(placesInDelhi.length);
	System.out.println(placesInGujarat.length);
	System.out.println(placesInMaharashtra.length);

		for(int i=0; i<placesInIndia.length; i++){
		System.out.println(placesInIndia[i]);
		}

		for(int j=0; j<placesInKarnataka.length; j++){
		System.out.println(placesInKarnataka[j]);
		}

		for(int k=0; k<placesInDelhi.length; k++){
		System.out.println(placesInDelhi[k]);
		}

		for(int p=0; p<placesInGujarat.length; p++){
		System.out.println(placesInGujarat[p]);
		}

		for(int q=0; q<placesInMaharashtra.length; q++){
		System.out.println(placesInMaharashtra[q]);
		}
	}

}

class Actors{

  public static void main(String a[]){

   String[] industries={"Hollywood","Bollywood","Sandalwood","Tollywood"};
   String[] hollywoodActors={"TomCruice","DwayneJohnson","Robert","BradPitt","TomHanks","Leonardo"};
   String[] bollywoodActors={"ShahRuhKhan","Deepika","SalmanKhan","AishwaryaRai","AmirKhan"};
   String[] sandalwoodActors={"Darshan","Sudeep","Ganesh","RajKumar"};
   String[] tollywoodActors={"AlluArjun","PawanKalyan","MaheshBabu","RamCharan"};

  
	System.out.println(industries.length);
	System.out.println(hollywoodActors.length);
	System.out.println(bollywoodActors.length);
	System.out.println(sandalwoodActors.length);
	System.out.println(tollywoodActors.length);

		for(int i=0; i<industries.length; i++){
		System.out.println(industries[i]);
		}

		for(int j=0; j<hollywoodActors.length; j++){
		System.out.println(hollywoodActors[j]);
		}

		for(int k=0; k<bollywoodActors.length; k++){
		System.out.println(bollywoodActors[k]);
		}

		for(int p=0; p<sandalwoodActors.length; p++){
		System.out.println(sandalwoodActors[p]);
		}

		for(int q=0; q<tollywoodActors.length; q++){
		System.out.println(tollywoodActors[q]);
		}

	}

}

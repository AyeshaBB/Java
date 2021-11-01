class Amazon{

  public static void main(String a[]){

   String types[]={"Series","Movies"};
   String amazonSeries[]={"Mumbai Diaries 26/11","UTOPIA","Mirzapur","The Boys","Manifest","Tandav","Hostel Daze","Family Man","The Expanse","Panchayat","Madern Love","FourMoreShots","RunAways","Made in Heaven","Patal Lok"};
   String amazonMovies[]={"Pagal","SherSha","Master","Karnan","Penguin","Narappa","V","HIT","Cinderella","Tenet","Robert","Nota","Action","Bhoot","Dia"};
  
	System.out.println(types.length);
	System.out.println(amazonSeries.length);
	System.out.println(amazonMovies.length);

		for(int p=0; p<types.length; p++){
		System.out.println(types[p]);
		}

		for(int q=0; q<amazonSeries.length; q++){
		System.out.println(amazonSeries[q]);
		}

		for(int k=0; k<amazonMovies.length; k++){
		System.out.println(amazonMovies[k]);
		}

	}

}

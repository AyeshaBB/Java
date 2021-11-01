class SocialMedia{

  public static void main(String a[]){

   String platforms[]={"FaceBook","Instagram","Tweeter"};
   String faceBook[]={"ProfilePic","Settings","Login","Logout","Home"};
   String instagram[]={"ProfilePic","Settings","Login","Logout","Home","Stories","Reels"};
   String tweeter[]={"Login","Stories","Logout"};
  
	System.out.println(platforms.length);
	System.out.println(faceBook.length);
	System.out.println(instagram.length);
	System.out.println(tweeter.length);


		for(int j=0; j<platforms.length; j++){
		System.out.println(platforms[j]);
		}

		for(int k=0; k<faceBook.length; k++){
		System.out.println(faceBook[k]);
		}

		for(int p=0; p<instagram.length; p++){
		System.out.println(instagram[p]);
		}

		for(int q=0; q<tweeter.length; q++){
		System.out.println(tweeter[q]);
		}	
	}

}

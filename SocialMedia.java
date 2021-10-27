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

	System.out.println(platforms[0]+" "+platforms[1]+" "+platforms[2]);
	System.out.println(faceBook[3]+" "+faceBook[1]+" "+faceBook[2]+" "+faceBook[0]+" "+faceBook[4]);
	System.out.println(instagram[0]+" "+instagram[2]+" "+instagram[4]+" "+instagram[3]+" "+instagram[1]+" "+instagram[5]+" "+instagram[6]);
	System.out.println(tweeter[2]+" "+tweeter[1]+" "+tweeter[0]);
	
	}

}

class AdditionOfTwoNumbers{

	public static void main(String a[]){

		System.out.println("main method started");

		addition(10,20);
		addition(30,40);
		addition(25,80);		

		System.out.println("main method ended");
	}

	public static void addition(int a, int b){

		int c = a+b;

		System.out.println(c);
	}

}
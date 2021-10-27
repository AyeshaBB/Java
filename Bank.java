class Bank{

  public static void main(String a[]){

   String sbiBranches[]={"Rajajinagar","Malleshwaram","Mejestic","Jalahalli Cross","Yeshwanthpur"};
   String typesOfAccounts[]={"Savings","Current",""};
   String typesOfLoans[]={"Home Loan","Study Loan","Car Loan","Personal Loan","Crop Loan"};
   String typesOfSchemes[]={"Flexi Deposit","FD Scheme","RD Scheme","Platinum Scheme"};
  
	System.out.println(sbiBranches.length);
	System.out.println(typesOfAccounts.length);
	System.out.println(typesOfLoans.length);
	System.out.println(typesOfSchemes.length);

	System.out.println(sbiBranches[3]+" "+sbiBranches[1]+" "+sbiBranches[2]+" "+sbiBranches[0]+" "+sbiBranches[4]);
	System.out.println(typesOfAccounts[0]+" "+typesOfAccounts[1]);
	System.out.println(typesOfLoans[0]+" "+typesOfLoans[2]+" "+typesOfLoans[4]+" "+typesOfLoans[3]+" "+typesOfLoans[1]);
	System.out.println(typesOfSchemes[2]+" "+typesOfSchemes[1]+" "+typesOfSchemes[0]+" "+typesOfSchemes[3]);
	
	}

}
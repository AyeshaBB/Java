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

		for(int j=0; j<sbiBranches.length; j++){
		System.out.println(sbiBranches[j]);
		}

		for(int k=0; k<typesOfAccounts.length; k++){
		System.out.println(typesOfAccounts[k]);
		}

		for(int p=0; p<typesOfLoans.length; p++){
		System.out.println(typesOfLoans[p]);
		}

		for(int q=0; q<typesOfSchemes.length; q++){
		System.out.println(typesOfSchemes[q]);
		}	
	}

}
class Companies{

  public static void main(String a[]){

   String types[]={"Product Based","Service Based"};
   String productBasedComapny[]={"Sigma","Fortune IT Innovations","Appscrip Cloud","Aspire Software Consultancy","Vyshnavi Pvt.Ltd","EdgeSoftware"};
   String serviceBasedComapny[]={"Wipro","Infosys","Accenture","TCS","IBM","Capgemini","Cognizant","Oracle"};
  
	System.out.println(types.length);
	System.out.println(productBasedComapny.length);
	System.out.println(serviceBasedComapny.length);

		for(int k=0; k<types.length; k++){
		System.out.println(types[k]);
		}

		for(int p=0; p<productBasedComapny.length; p++){
		System.out.println(productBasedComapny[p]);
		}

		for(int q=0; q<serviceBasedComapny.length; q++){
		System.out.println(serviceBasedComapny[q]);
		}
	
	}

}

class Companies{

  public static void main(String a[]){

   String types[]={"Product Based","Service Based"};
   String productBasedComapny[]={"Sigma","Fortune IT Innovations","Appscrip Cloud","Aspire Software Consultancy","Vyshnavi Pvt.Ltd","EdgeSoftware"};
   String serviceBasedComapny[]={"Wipro","Infosys","Accenture","TCS","IBM","Capgemini","Cognizant","Oracle"};
  
	System.out.println(types.length);
	System.out.println(productBasedComapny.length);
	System.out.println(serviceBasedComapny.length);

	System.out.println(types[0]+" "+types[1]);
	System.out.println(productBasedComapny[3]+" "+productBasedComapny[1]+" "+productBasedComapny[2]+" "+productBasedComapny[0]+" "+productBasedComapny[4]+" "+productBasedComapny[5]);
	System.out.println(serviceBasedComapny[0]+" "+serviceBasedComapny[2]+" "+serviceBasedComapny[4]+" "+serviceBasedComapny[3]+" "+serviceBasedComapny[1]+" "+serviceBasedComapny[6]+" "+serviceBasedComapny[7]+" "+serviceBasedComapny[5]);
	
	}

}

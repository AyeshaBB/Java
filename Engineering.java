class Engineering{

  public static void main(String a[]){

   String branches[]={"EC","CS","MECH","IS"};
   String ecSubjects[]={"ControlSystems","SS","Microcontroller","BasicElectronics"};
   String csSubjects[]={"ComputerOrganization","SoftwareEngg","DataStructure","DMS","DSA"};
   String mechSubjects[]={"Maths1","Maths2","Maths3"};
   String infoSujects[]={"IS1","IS2","IS3","IS4"};

  
	System.out.println(branches.length);
	System.out.println(ecSubjects.length);
	System.out.println(csSubjects.length);
	System.out.println(mechSubjects.length);
	System.out.println(infoSujects.length);

		for(int i=0; i<branches.length; i++){
		System.out.println(branches[i]);
		}

		for(int j=0; j<ecSubjects.length; j++){
		System.out.println(ecSubjects[j]);
		}

		for(int k=0; k<csSubjects.length; k++){
		System.out.println(csSubjects[k]);
		}

		for(int p=0; p<mechSubjects.length; p++){
		System.out.println(mechSubjects[p]);
		}

		for(int q=0; q<infoSujects.length; q++){
		System.out.println(infoSujects[q]);
		}
	
	}

}
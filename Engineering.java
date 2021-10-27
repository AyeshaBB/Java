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

	System.out.println(branches[3]+" "+branches[1]+" "+branches[2]+" "+branches[0]);
	System.out.println(ecSubjects[3]+" "+ecSubjects[1]+" "+ecSubjects[2]+" "+ecSubjects[0]);
	System.out.println(csSubjects[0]+" "+csSubjects[2]+" "+csSubjects[4]+" "+csSubjects[3]+" "+csSubjects[1]);
	System.out.println(mechSubjects[2]+" "+mechSubjects[1]+" "+mechSubjects[0]);
	System.out.println(infoSujects[3]+" "+infoSujects[0]+" "+infoSujects[1]+" "+infoSujects[2]);
	
	}

}
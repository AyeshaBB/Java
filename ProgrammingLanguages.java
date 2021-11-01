class ProgrammingLanguages{

  public static void main(String a[]){

   String types[]={"Software Langauge","Hardware Language"};
   String softWareLanguages[]={"Java","C++","Python","JQuary","SQL","CSS","C#","C","JavaScript","Go","R","Swift","PHP"};
   String hardWareLanguages[]={"VHDL","Verilog","Assembly Language","Ada","Rust","Lua","Embedded C++"};
  
	System.out.println(types.length);
	System.out.println(softWareLanguages.length);
	System.out.println(hardWareLanguages.length);

		for(int i=0; i<types.length; i++){
		System.out.println(types[i]);
		}

		for(int j=0; j<softWareLanguages.length; j++){
		System.out.println(softWareLanguages[j]);
		}

		for(int k=0; k<hardWareLanguages.length; k++){
		System.out.println(hardWareLanguages[k]);
		}

	}

}

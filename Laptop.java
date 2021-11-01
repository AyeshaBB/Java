class Laptop{
	OsysDTO[] osys;
	int index;

	public Laptop(int size){
		osys = new OsysDTO[size];
	}
	
	public boolean addLaptop(OsysDTO osys){
		boolean isAdded = false;
		System.out.println("Inside addLaptop()");

		if(osys != null){
		  System.out.println("Adding OSys");
		  this.osys[index++] = osys;
		  isAdded = true;
		}
		else{
		    System.out.println("Cannot add OSys");
		}
		return isAdded;
	}
	
	public void printDetails(){
	   for(int i = 0; i<osys.length; i++){
		if(osys[i] != null){
		  System.out.println(osys[i].getOsysId()+ " "+osys[i].getOsysName()+ " "+osys[i].getOsysPrice()+ " "+osys[i].getOsysType());
		}
	    }
	}
}
class Mobile{
	AppDTO[] app;
	int index;

	public Mobile(int size){
		app = new AppDTO[size];
	}
	
	public boolean addApp(AppDTO app){
		boolean isAdded = false;
		System.out.println("Inside addApp()");

		if(app != null){
		  System.out.println("Adding App");
		  this.app[index++] = app;
		  isAdded = true;
		}
		else{
		    System.out.println("Cannot add book");
		}
		return isAdded;
	}
	
	public void printDetails(){
	   for(int i = 0; i<app.length; i++){
		if(app[i] != null){
		  System.out.println(app[i].getAppName()+ " "+app[i].getAppInMb()+ " "+app[i].getAppType());
		}
	    }
	}
}
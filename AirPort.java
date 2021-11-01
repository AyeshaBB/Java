class AirPort{
	TerminalDTO[] terminal;
	int index;

	public AirPort(int size){
		terminal = new TerminalDTO[size];
	}
	
	public boolean addTerminal(TerminalDTO terminal){
		boolean isAdded = false;
		System.out.println("Inside addTerminal()");

		if(terminal != null){
		  System.out.println("Adding Terminal");
		  this.terminal[index++] = terminal;
		  isAdded = true;
		}
		else{
		    System.out.println("Cannot add terminal");
		}
		return isAdded;
	}
	
	public void printDetails(){
	   for(int i = 0; i<terminal.length; i++){
		if(terminal[i] != null){
		  System.out.println(terminal[i].getTerminalId()+ " "+terminal[i].getTerminalName()+ " "+terminal[i].getTerminalPlace());
		}
	    }
	}
}
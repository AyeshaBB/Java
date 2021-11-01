class Bank{
	AccountDTO[] accnt;
	int index;

	public Bank(int size){
		accnt = new AccountDTO[size];
	}
	
	public boolean addAccount(AccountDTO accnt){
		boolean isAdded = false;
		System.out.println("Inside addAccount()");

		if(accnt != null){
		  System.out.println("Adding Account");
		  this.accnt[index++] = accnt;
		  isAdded = true;
		}
		else{
		    System.out.println("Cannot add book");
		}
		return isAdded;
	}
	
	public void printDetails(){
	   for(int i = 0; i<accnt.length; i++){
		if(accnt[i] != null){
		  System.out.println(accnt[i].getAccountNumber()+ " "+accnt[i].getAccountHolderName()+ " "+accnt[i].getBankBranch()+ " "+accnt[i].getAccountType());
		}
	    }
	}
}
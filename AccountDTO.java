public class AccountDTO{

	private int accountNumber;
	private String accountHolderName;
	private String bankBranch;
	private String accountType;

	public void setAccountNumber(int accountNumber){
	    this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
	    return accountNumber;
	}

	public void setAccountHolderName(String accountHolderName){
	    this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName(){
	    return accountHolderName;
	}

	public void setBankBranch(String bankBranch){
	    this.bankBranch = bankBranch;
	}
	public String getBankBranch(){
	    return bankBranch;
	}

	public void setAccountType(String accountType){
	    this.accountType = accountType;
	}
	public String getAccountType(){
	    return accountType;
	}
}
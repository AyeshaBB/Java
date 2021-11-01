import java.util.Scanner;
class BankUtil{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Bank bank = new Bank(size);
		AccountDTO dto = new AccountDTO();
		dto.setAccountNumber(12345);
		dto.setAccountHolderName("Ayesha");
		dto.setBankBranch("Hph");
		dto.setAccountType("Savings");

		bank.addAccount(dto);
		bank.printDetails();
	}
}
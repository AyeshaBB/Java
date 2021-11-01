import java.util.Scanner;
class AirPortUtil{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		AirPort airPrt = new AirPort(size);
		TerminalDTO dto = new TerminalDTO();
		dto.setTerminalId(1);
		dto.setTerminalName("Terminal-1");
		dto.setTerminalPlace("Mumbai");

		airPrt.addTerminal(dto);
		airPrt.printDetails();
	}
}
import java.util.Scanner;
class LaptopUtil{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Laptop lap = new Laptop(size);
		OsysDTO dto = new OsysDTO();
		dto.setOsysId(123);
		dto.setOsysName("Windows");
		dto.setOsysPrice(1500.00);
		dto.setOsysType("Windows-10");

		lap.addLaptop(dto);
		lap.printDetails();
	}
}
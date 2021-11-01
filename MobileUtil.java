import java.util.Scanner;
class MobileUtil{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Mobile mob = new Mobile(size);
		AppDTO dto = new AppDTO();
		dto.setAppName("Instagram");
		dto.setAppInMb(56.00);
		dto.setAppType("Mobile App");

		mob.addApp(dto);
		mob.printDetails();
	}
}
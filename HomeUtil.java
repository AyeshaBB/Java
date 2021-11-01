import java.util.Scanner;
class HomeUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Home home = new Home(size);
		FurnitureDTO dto = new FurnitureDTO();
		dto.setFurnitureName("Sofa");
		dto.setNumberOfFurniture(1);
		dto.setFurnitureColor("Black");

		FurnitureDTO dto1 = new FurnitureDTO();		
		dto1.setFurnitureName("Desk");
		dto1.setNumberOfFurniture(2);
		dto1.setFurnitureColor("Grey");
		
		home.addFurniture(dto);
		home.addFurniture(dto1);
		home.printDetails();
		
	}
}
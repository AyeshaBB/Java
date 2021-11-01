import java.util.Scanner;
class HotelUtil{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Hotel hotel = new Hotel(size);
		FoodItemsDTO dto = new FoodItemsDTO();
		FoodItemsDTO dto1 = new FoodItemsDTO();
		dto.setFoodPrice(100.00);
		dto.setFoodName("Noodles");
		dto.setFoodType("Chinese");
		dto.setFoodId(1);

		dto1.setFoodPrice(12);
		dto1.setFoodName("Biryani");
		dto1.setFoodType("Hyderabad");
		dto1.setFoodId(2);

		hotel.addFoodItem(dto);

		hotel.addFoodItem(dto);
		hotel.printDetails();
	}
}
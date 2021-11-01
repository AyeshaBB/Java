import java.util.Scanner;
class PgUtil{

	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Pg pg = new Pg(size);
		RoomDTO dto = new RoomDTO();
		dto.setRoomNum(20);
		dto.setRoomPrice(5000.00);
		dto.setRoomType("2 Sharing Room");

		pg.addRoom(dto);
		pg.printDetails();
	}
}
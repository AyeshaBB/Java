import java.util.Scanner;
class BagUtil{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Bag bag = new Bag(size);
		BookDTO dto = new BookDTO();
		dto.setBookId(12);
		dto.setBookName("Python");
		dto.setBookPrice(500.00);
		dto.setBookType("Progarmmimg");

		bag.addBook(dto);
		bag.printDetails();
	}
}
public class RoomDTO{

	private int roomNum;
	private double roomPrice;
	private String roomType;

	public void setRoomNum(int roomNum){
		this.roomNum = roomNum;
	}
	public int getRoomNum(){
		return roomNum;
	}

	public void setRoomPrice(double roomPrice){
		this.roomPrice = roomPrice;
	}
	public double getRoomPrice(){
		return roomPrice;
	}

	public void setRoomType(String roomType){
		this.roomType = roomType;
	}	
	public String getRoomType(){
		return roomType;
	}
}
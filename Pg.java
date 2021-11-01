class Pg{

	RoomDTO[] room;
	int index;

	public Pg(int size){
		room = new RoomDTO[size];
	}

	public boolean addRoom(RoomDTO room){
		boolean isAdded = false;
		System.out.println("Inside addRoom()");
		
		if(room != null){
		  System.out.println("Adding Room");
		  this.room[index++] = room;
		  isAdded = true;
		}
		else{
		  System.out.println("Cannot add Room");
		}
		return isAdded;
	}

	public void printDetails(){
		for(int i=0; i<room.length; i++){
		  if(room[i] != null){
			System.out.println(room[i].getRoomNum()+ " "+room[i].getRoomPrice()+ " "+room[i].getRoomType());
		   }
		}
	}
}
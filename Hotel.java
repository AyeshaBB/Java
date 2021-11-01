class Hotel{
	FoodItemsDTO[] foodItem;
	int index;

	public Hotel(int size){
		foodItem = new FoodItemsDTO[size];
	}
	public boolean addFoodItem(FoodItemsDTO foodItem){
		boolean isAdded = false;
		System.out.println("Inside addFoodItem");

		if(foodItem != null){
		  System.out.println("Adding Food");
		  this.foodItem[index++] = foodItem;
		  isAdded = true;
		}
		else{
		  System.out.println("Cannot add Food");
		}
			return isAdded;
	}

	public void printDetails(){
		for(int i=0; i<foodItem.length; i++){
		  if(foodItem[i] !=null){
			System.out.println(foodItem[i].getFoodPrice()+ " " +foodItem[i].getFoodName()+ " " +foodItem[i].getFoodType()+ " " +foodItem[i].getFoodId());
		  }
		}
	}
}
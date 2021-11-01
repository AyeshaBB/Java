class FoodItemsDTO{

	private double foodPrice;
	private String foodName;
	private String foodType;
	private int foodId;

	public void setFoodPrice(double foodPrice){
		this.foodPrice = foodPrice;
	}
	public double getFoodPrice(){
		return foodPrice;
	}
	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
	public String getFoodName(){
		return foodName;
	}
	public void setFoodType(String foodType){
		this.foodType = foodType;
	}
	public String getFoodType(){
		return foodType;
	}
	public void setFoodId(int foodId){
		this.foodId = foodId;
	}
	public int getFoodId(){
		return foodId;
	}

}
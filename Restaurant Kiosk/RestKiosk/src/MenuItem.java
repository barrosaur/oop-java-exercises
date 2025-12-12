
public class MenuItem extends FoodItem {
    private int quantity;

    public MenuItem(String foodName, double foodPrice, int quantity) {
        super(foodName, foodPrice);
        this.quantity = quantity;
    }

    public double getTotalFoodPrice() {
        return this.getFoodPrice() * this.quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

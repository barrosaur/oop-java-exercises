import java.awt.*;

public class FoodItem {
    private String foodName;
    private Image foodImg;
    private double foodPrice;

    public FoodItem(String foodName, Image foodImg,  double foodPrice) {
        this.foodName = foodName;
        this.foodImg = foodImg;
        this.foodPrice = foodPrice;
    }

    public FoodItem(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public double getFoodPrice() {
        return this.foodPrice;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
}

import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Order(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public double getFullPrice() {
        double total = 0;
        for (MenuItem item: menuItems) {
            double price = item.getTotalFoodPrice();
            total += price;
        }

        return total;
    }

    public void displayOrder() {
        for(MenuItem item: menuItems) {
            System.out.println(item.getFoodName() + "\t" + item.getQuantity() + "\t" + item.getTotalFoodPrice());
        }
        System.out.println();
        System.out.println("Order total: \t\t\t" + getFullPrice());
        System.out.println("=========================================================");
    }
}

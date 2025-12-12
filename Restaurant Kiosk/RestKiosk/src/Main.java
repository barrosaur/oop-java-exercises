import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int orderCount = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Nell's Diner!");
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("\nHow may we serve you?");
            System.out.println("[1] - Make an order");
            System.out.println("[2] - Exit");
            System.out.print("Enter choice: ");
            int choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 1:
                    makeOrder();
                    break;
                case 2:
                    System.out.println("Exiting system...");
                    System.out.println("Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }

    public static void makeOrder() {
        Scanner s = new Scanner(System.in);

        FoodItem[] foodItems = declareFoodItems();
        int index = 0;
        ArrayList<MenuItem> orders = new ArrayList<>();
        while(true) {
            System.out.println("\nMake an order!");

            for(FoodItem item : foodItems) {
                System.out.println((index + 1) + " - " + item.getFoodName() + "\t" + item.getFoodPrice());
                index++;
            }
            index = 0;

            System.out.print("Enter choice: ");
            int choice = s.nextInt();
            s.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = s.nextInt();
            s.nextLine();

            MenuItem item = new MenuItem(foodItems[choice - 1].getFoodName(), foodItems[choice - 1].getFoodPrice(), quantity);
            orders.add(item);
            System.out.print("Would you like to make another order? (Y/N): ");
            String opt = s.nextLine();


            if(opt.equalsIgnoreCase("N")) {
                Order order = new Order(orders);
                orderCount++;
                System.out.println("\nYour orders:");
                System.out.println("=========================================================");
                order.displayOrder();
                System.out.println("\nOrder Count: " + orderCount);
                break;
            }

        }
    }

    public static FoodItem[] declareFoodItems() {
        FoodItem food1 = new FoodItem("Breakfast Meal", 125.00);
        FoodItem food2 = new FoodItem("Sisig-silog", 75.25);
        FoodItem food3 = new FoodItem("Sinigang", 155.75);
        FoodItem food4 = new FoodItem("Roasted Chicken (Whole)", 217.20);
        FoodItem food5 = new FoodItem("Fish and Chips", 150.00);

        return new FoodItem[]{food1, food2, food3, food4, food5};
    }

}

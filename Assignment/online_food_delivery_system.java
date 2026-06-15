package Assignment;

// Food Item Class
class FoodItem {
    int itemId;
    String itemName;
    double price;
    int quantity;

    FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateAmount() {
        return price * quantity;
    }

    void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: " + calculateAmount());
        System.out.println("------------------");
    }
}

// Customer Class
class Customer {
    int customerId;
    String customerName;
    String mobileNumber;

    Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("------------------");
    }
}

// Main Class
public class online_food_delivery_system {

    public static void main(String[] args) {

        FoodItem f1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem f2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem f3 = new FoodItem(103, "Pasta", 180, 2);
        FoodItem f4 = new FoodItem(104, "Cold Drink", 50, 3);

        Customer c1 = new Customer(1, "Rahul Sharma", "9876543210");

        c1.displayCustomerDetails();

        f1.displayItemDetails();
        f2.displayItemDetails();
        f3.displayItemDetails();
        f4.displayItemDetails();

        double totalBill =
                f1.calculateAmount()
              + f2.calculateAmount()
              + f3.calculateAmount()
              + f4.calculateAmount();

        System.out.println("===== ORDER SUMMARY =====");
        System.out.println("Customer Name: " + c1.customerName);
        System.out.println("Total Bill: " + totalBill);
    }
}
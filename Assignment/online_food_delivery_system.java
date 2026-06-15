package Assignment;
class FoodItem {
    
    int itemId;
    String itemName;
    double price;
    int quantity;

    // Constructor
    FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate Amount
    double calculateAmount() {
        return price * quantity;
    }

    // Display Item Details
    void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Amount : " + calculateAmount());
        System.out.println("-----------------------");
    }
}

class Customer {
    int customerId;
    String customerName;
    String mobileNumber;

    // Constructor
    Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    // Display Customer Details
    void displayCustomerDetails() {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("-----------------------");
    }
}

public class online_food_delivery_system {
    public static void main(String[] args) {

        // Creating 4 FoodItem Objects
        FoodItem f1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem f2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem f3 = new FoodItem(103, "Pasta", 180, 2);
        FoodItem f4 = new FoodItem(104, "Cold Drink", 50, 3);

        // Creating 2 Customer Objects
        Customer c1 = new Customer(1, "Rahul Sharma", "9876543210");
        Customer c2 = new Customer(2, "Priya Singh", "9876501234");

        // Display Customer Details
        c1.displayCustomerDetails();

        // Display All Item Details
        f1.displayItemDetails();
        f2.displayItemDetails();
        f3.displayItemDetails();
        f4.displayItemDetails();

        // Calculate Total Bill
        double totalBill = 0;
        totalBill += f1.calculateAmount();
        totalBill += f2.calculateAmount();
        totalBill += f3.calculateAmount();
        totalBill += f4.calculateAmount();

        // Order Summary
        System.out.println("===== ORDER SUMMARY =====");
        System.out.println("Customer Name : " + c1.customerName);
        System.out.println("-----------------------");
        System.out.println("Total Bill : " + totalBill);
        System.out.println("========================");
    }
}


package Assignment;

public class online_food_delivery_system {
    class FoodItem{
        int itemId;
        String itemName;
        double price;
        int quantity;

        FoodItem(int itemId,String itemName,double price,int quantity){
            this.itemId=itemId;
            this.itemName=itemName;
            this.price=price;
            this.quantity=quantity;

        }
        double calculateAmount() {
            return price*quantity;
        }
        void displayItemDetails() {
            System.out.println("Item ID :" +itemId);
            System.out.println("Item Name :" +itemName);
            System.out.println("Price :" + price);
            System.out.println("Quantity :" +quantity);
            System.out.println("Amount :" +calculateAmount());
    System.out.println("------------------------");
        }
    }
    class Customer{
        int customerId;
        String customerName;
        String mobileNumber;

    Customer(int customerId , String customerName , String mobileNumber) {
        this.customerId
        }
        
    }
}

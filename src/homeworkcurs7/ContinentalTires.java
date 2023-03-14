package homeworkcurs7;

public class ContinentalTires implements TiresProvaider {
    public static void main(String[] args){

    }
    private static double pricePerItem = 400;
    private int quantity = 0;
    private double amountToPay = 0;

    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("ContinentalTires was payed " + amount);
            return true;
        }
        return false;
    }

    public String deliverTires() {
        quantity++;
        amountToPay += pricePerItem;
        return "tires";
    }

    public int getDeliveredQuantity() {
        return quantity;
    }


}

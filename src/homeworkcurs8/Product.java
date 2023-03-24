package homeworkcurs8;

public class Product {
    private int quantity;
    private double price;

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int i) {
        setPrice(0);

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    private String name;
}

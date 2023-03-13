public class Product {
    public static void main(String[] args){

    }
    private String name;
    private double price;
    private int quantity;
    private String category = "Fruit";

    Product(String name, double price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public boolean hasStock(){
        if (quantity > 0){
            System.out.println("Your product has a quantity of:" + quantity);
            return true;
        } else {
            System.out.println("There is not sufficient stock!");
            return false;

        }
    }
    public boolean isCategory(String category){
        if (this.category == category){
            System.out.println("Your product is in the category" + this.category);
            return true;
        } else {
            System.out.println("Category not found");
            return false;
        }
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getCategory(){
        return category;
    }
}


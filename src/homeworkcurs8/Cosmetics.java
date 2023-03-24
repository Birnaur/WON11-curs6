package homeworkcurs8;

import homeworkcurs8.Product;

public class Cosmetics extends Product{
    private boolean colour;
    private int weight;
    public boolean isColour() {
        return colour;
    }
    public void setColour(boolean colour) {
        this.colour = colour;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}

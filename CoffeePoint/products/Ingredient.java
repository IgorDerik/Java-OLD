package CoffeePoint.products;

public class Ingredient {

    private String name;

    private int basePrice; //base price in coins

    public Ingredient(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(int price) {
        this.basePrice = price;
    }
}

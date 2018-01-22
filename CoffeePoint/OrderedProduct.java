package CoffeePoint;

import CoffeePoint.products.Product;

public class OrderedProduct {

    public OrderedProduct(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    private Product product;

    private int amount;

    public int getPrice() {
        return product.getPrice() * amount;
    }

    public String getName() {
        return product.getName();
    }

    public int getAmount() {
        return amount;
    }

    public String getStatement() {
        return getName() + ": " + getPrice()/100 + " UAH. Amount: " + getAmount()+ "\n";
    }
}

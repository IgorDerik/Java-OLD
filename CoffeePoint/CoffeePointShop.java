package CoffeePoint;

import CoffeePoint.products.Product;
import java.util.LinkedList;

public class CoffeePointShop {

    private String brandName;

    private LinkedList<Product> productsMenu;

    public Order getNewOrder() {
        return new Order();
    }

    public void setProductsMenu(LinkedList<Product> productsMenu) {
        this.productsMenu = productsMenu;
    }

    public CoffeePointShop(String brandName) {
        this.brandName = brandName;
    }

    public CoffeePointShop(String brandName, LinkedList<Product> productsMenu) {
        this.brandName = brandName;
        this.productsMenu = productsMenu;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public LinkedList<Product> getMenu() {
        return productsMenu;
    }

    public void addBonusMoney(Customer customer, int sum) { //to be moved on order
        customer.setBonusMoney( (customer.getBonusMoney()) + sum/10);
    }
}

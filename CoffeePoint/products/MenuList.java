package CoffeePoint.products;

import java.util.LinkedList;

public class MenuList {

    private static LinkedList<Product> list = new LinkedList<>();

    public static LinkedList<Product> getList() {
        return list;
    }

    private static void addCoffee(String name, int capacity) {
        list.add(new Coffee(name,capacity));
    }

    /*
    MORE PRODUCTS WILL BE ADD
     */

    static {
        addCoffee("Espresso",150);
        addCoffee("Americano",250);
        addCoffee("Cappuccino",200);
    }

}

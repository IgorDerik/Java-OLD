package CoffeePoint;

//import CoffeePoint.payment.CashPayType;
import CoffeePoint.products.MenuList;
//import CoffeePoint.products.Product;

public class Main {

    public static void main(String[] args) {

        CoffeePointShop shop = new CoffeePointShop("Urban");

        shop.setProductsMenu(MenuList.getList());

        Customer customer = new Customer("Igor",10000,999999999,1000000000);

        Order order1 = shop.getNewOrder();

        order1.addProduct(shop.getMenu().getFirst(),1);
        order1.addProduct(shop.getMenu().get(1),2);

//        System.out.println(order1.pay(new CashPayType(customer)));
        if ( order1.pay(customer,PayTypes.BONUSES) ) System.out.println("ORDER PAYED");

        System.out.println(order1.getStatement());

        System.out.println(order1.getTotalOrderPrice()/100+" UAH TOTAL");

        shop.addBonusMoney(customer,order1.getTotalOrderPrice()); //WILL REDONE LOGIC

        System.out.println();
        System.out.println(customer.getBonusMoney());
        /*
        for (Product product: shop.getMenu()) {
//            System.out.print(product.getName()+" ");
//            System.out.println(product.getPrice());
        }
        */

    }

}

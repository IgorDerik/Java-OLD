package CoffeePoint;

import CoffeePoint.payment.Payment;
import CoffeePoint.payment.PaymentType;
import CoffeePoint.products.Product;

import java.util.LinkedList;

public class Order {

    private LinkedList<OrderedProduct> orderedProductList = new LinkedList<>();

    public void addProduct(Product product, int amount) {
        orderedProductList.add(new OrderedProduct(product,amount));
    }

    public int getTotalOrderPrice() {

        int result = 0;

        for (OrderedProduct orderedProduct : orderedProductList) {

            result += orderedProduct.getPrice();

        }

        return result;
    }

    public String getStatement() {
        StringBuilder resultBuilder = new StringBuilder();

        for (OrderedProduct product : orderedProductList) {
            resultBuilder.append(product.getStatement());
        }

        return resultBuilder.toString();
    }

    public boolean pay(Customer customer, PayTypes type) { // !!! TEMPORARY METHOD !!! //
        boolean result = false;

        int money = 0; //= paymentType.getMoney();
        if (type==PayTypes.BONUSES) money = customer.getBonusMoney();
        if (type==PayTypes.CASH) money = customer.getCashMoney();
        if (type==PayTypes.CREDITCARD) money = customer.getCreditCardMoney();


        if(money >= getTotalOrderPrice()) {

//            paymentType.setMoney(money-sum);
            if (type==PayTypes.BONUSES) customer.setBonusMoney(money-getTotalOrderPrice());
            if (type==PayTypes.CASH) customer.setBonusMoney(money-getTotalOrderPrice());
            if (type==PayTypes.CREDITCARD) customer.setBonusMoney(money-getTotalOrderPrice());

            result = true;
        }

        return result;
    }

    /*

    public boolean pay(PaymentType paymentType) {

        Payment payment = new Payment(paymentType, getTotalOrderPrice());
        payment.makePayment();
        return false;
    }
    */
}

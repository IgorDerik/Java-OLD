package CoffeePoint.payment;

import CoffeePoint.Customer;

public class Payment {

    /*
    в розробці
     */

//    private String name;

    private PaymentType paymentType;

    private int sum;

    public Payment(PaymentType paymentType, int sum) {
        this.paymentType = paymentType;
        this.sum = sum;
    }

    //    public abstract boolean makePayment(int sum, Customer customer);

    public boolean makePayment() {

        boolean result = false;

        int money = paymentType.getMoney(); //customer.getCreditCardMoney();

        if(money >= sum) {
//            customer.setCreditCardMoney(money-sum);
            paymentType.setMoney(money-sum);
            result = true;
        }

        return result;
    }

}

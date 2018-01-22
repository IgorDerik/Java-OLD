package CoffeePoint.payment;

import CoffeePoint.Customer;

public abstract class PaymentType {

    /*
    в розробці
     */

    private Customer customer;

    public PaymentType(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public abstract int getMoney();

    public abstract void setMoney(int sum);

}

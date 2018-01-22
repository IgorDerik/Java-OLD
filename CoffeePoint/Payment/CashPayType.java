package CoffeePoint.payment;

import CoffeePoint.Customer;

public class CashPayType extends PaymentType {

    /*
    в розробці
     */

    public CashPayType(Customer customer) {
        super(customer);
    }

    @Override
    public int getMoney() {
        return getCustomer().getCashMoney();
    }

    @Override
    public void setMoney(int sum) {
        getCustomer().setCashMoney(sum);
    }
}

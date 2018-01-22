package CoffeePoint;

public class Customer {

    private String name;

    private int bonusMoney;

    private int cashMoney;

    private int creditCardMoney;

    public Customer(String name, int bonusPoints, int cashMoney, int creditCardMoney) {
        this.name = name;
        this.bonusMoney = bonusPoints;
        this.cashMoney = cashMoney;
        this.creditCardMoney = creditCardMoney;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int bonusPoints) {
        this.name = name;
        this.bonusMoney = bonusPoints;
    }

    public String getName() {
        return name;
    }

    public int getBonusMoney() {
        return bonusMoney;
    }

    public int getCashMoney() {
        return cashMoney;
    }

    public int getCreditCardMoney() {
        return creditCardMoney;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBonusMoney(int bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public void setCashMoney(int cashMoney) {
        this.cashMoney = cashMoney;
    }

    public void setCreditCardMoney(int creditCardMoney) {
        this.creditCardMoney = creditCardMoney;
    }
}

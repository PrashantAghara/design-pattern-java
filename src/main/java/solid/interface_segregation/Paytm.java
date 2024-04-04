package solid.interface_segregation;

public class Paytm implements UPIPayments {
    @Override
    public void payMoney() {

    }

    @Override
    public void getCard() {

    }

    @Override
    public void getCashBack() {
        // Not present in PayTM so violates interface segregation.
    }
}

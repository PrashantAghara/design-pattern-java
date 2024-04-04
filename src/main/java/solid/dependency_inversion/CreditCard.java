package solid.dependency_inversion;

public class CreditCard {
    public void doTransaction(long amount) {
        System.out.println("Payment Using Credit Card of amount : " + amount);
    }
}

package solid.dependency_inversion;

public class DebitCard {
    public void doTransaction(long amount) {
        System.out.println("Payment Using Debit Card of amount : " + amount);
    }
}

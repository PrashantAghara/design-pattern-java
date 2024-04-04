package solid.dependency_inversion.solution;

public class DebitCard implements Card {
    @Override
    public void doPayment(long amt) {
        System.out.println("Debit Card Payment : " + amt);
    }
}

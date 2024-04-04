package solid.dependency_inversion.solution;

public class CreditCard implements Card {
    @Override
    public void doPayment(long amt) {
        System.out.println("Credit Card Payment : " + amt);
    }
}

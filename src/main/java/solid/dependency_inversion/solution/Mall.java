package solid.dependency_inversion.solution;

public class Mall {
    Card card;

    public Mall(Card card) {
        this.card = card;
    }

    public static void main(String[] args) {
        Card creditCard = new CreditCard();
        Card debitCard = new DebitCard();
        Mall mall = new Mall(creditCard);
        mall.doPurchase(1000);
        mall = new Mall(debitCard);
        mall.doPurchase(1000);
    }

    public void doPurchase(long amt) {
        card.doPayment(amt);
    }
}

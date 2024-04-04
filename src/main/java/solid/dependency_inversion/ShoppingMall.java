package solid.dependency_inversion;

public class ShoppingMall {
    private DebitCard debitCard;


    // Tightly coupled with DebitCard.
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchase(long amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        // Does not follow dependency inversion
        DebitCard debit = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debit);
        shoppingMall.doPurchase(1000);
    }
}

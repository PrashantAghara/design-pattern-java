package code.design.adaptor;

public class AdapterMain {
    public static void main(String[] args) {
        AndroidCharger androidCharger = new ChargerAND();
        ChargerAdapter adapter = new ChargerAdapter(androidCharger);

        IPhone13 iPhone13 = new IPhone13(adapter);
        iPhone13.chargePhone();
    }
}

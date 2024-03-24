package code.design.adaptor;

public class ChargerAdapter implements AppleCharger {
    AndroidCharger androidCharger;
    public ChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargePhone() {
        androidCharger.chargeAndroid();
    }
}

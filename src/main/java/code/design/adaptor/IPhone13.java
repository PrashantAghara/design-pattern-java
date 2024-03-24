package code.design.adaptor;

public class IPhone13 {
    private AppleCharger appleCharger;

    public IPhone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargePhone() {
        appleCharger.chargePhone();
    }
}

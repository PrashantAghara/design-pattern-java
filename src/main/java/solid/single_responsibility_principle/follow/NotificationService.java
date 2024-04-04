package solid.single_responsibility_principle.follow;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //email
        } else {
            //sms
        }
    }
}

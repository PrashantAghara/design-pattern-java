package solid.single_responsibility_principle.not;

//This does not follow Single Responsibility
public class BankService {
    public void printPassBook() {
        //Get Passbook details
    }

    public void getLoanInfo(String type) {
        //loan info based on type
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //email
        } else {
            //sms
        }
    }
}

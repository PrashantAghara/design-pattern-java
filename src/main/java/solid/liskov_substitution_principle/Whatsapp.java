package solid.liskov_substitution_principle;

// Not supports Liskov Substitution as one method from SocialMedia is not supported by Whatsapp.
public class Whatsapp extends SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {
        //Not Applicable
    }

    @Override
    public void videoCall() {

    }
}

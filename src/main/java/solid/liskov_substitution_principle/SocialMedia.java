package solid.liskov_substitution_principle;

public abstract class SocialMedia {

    //Supported by Whatsapp, Facebook & Instagram
    public abstract void chatWithFriend();

    //Supported by Facebook & Instagram
    public abstract void publishPost();

    //Supported by Whatsapp, Facebook
    public abstract void videoCall();
}

package code.design.builder;

public class BuilderMain {
    public static void main(String[] args) {
        // Used to create immutable object
        User user = new User.Builder()
                .setId("1")
                .setName("Prashant")
                .setEmail("test@gmail.com")
                .build();
        System.out.println(user.toString());
    }
}

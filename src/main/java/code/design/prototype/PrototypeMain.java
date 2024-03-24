package code.design.prototype;

public class PrototypeMain {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("127.0.0.1");
        networkConnection.loadData();
        System.out.println(networkConnection);
        NetworkConnection networkConnection1 = networkConnection.clone();
        // This change will be added to connection 2 also
        networkConnection.getDomains().remove(0);
        System.out.println(networkConnection);

        System.out.println("===Creating new Object===");
        System.out.println(networkConnection1);
    }
}

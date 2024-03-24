package code.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadData() throws InterruptedException {
        this.data = "Data";
        domains.add("google.com");
        domains.add("github.com");
        domains.add("amazon.com");
        Thread.sleep(2000);
        // It will take some time
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public NetworkConnection clone() {
        // Logic for cloning
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());

        for (String domain : this.getDomains()) {
            networkConnection.getDomains().add(domain);
        }
        return networkConnection;
    }
}



package code.design.observer;

public class Subscriber implements Observer {
    @Override
    public void notified() {
        System.out.println("New Video Uploaded Notification");
    }
}

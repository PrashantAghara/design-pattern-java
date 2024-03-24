package code.design.observer;

public class ObserverMain {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();

        youtubeChannel.subscribe(s1);
        youtubeChannel.subscribe(s2);
        youtubeChannel.notifyChanges();
    }
}

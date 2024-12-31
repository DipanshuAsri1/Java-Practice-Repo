package DesignPattern.Observer;

public class Demo {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel=new YouTubeChannel();

        Subscriber deep=new Subscriber("deep");

        youTubeChannel.subscribe(deep);
        youTubeChannel.notifyChanges();
    }
}

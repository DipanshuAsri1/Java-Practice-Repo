package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscribers=new ArrayList<Observer>();


    @Override
    public void subscribe(Observer obs) {
        this.subscribers.add(obs);
    }

    @Override
    public void unsubscribe(Observer obs) {
       this.subscribers.remove(obs);
    }

    @Override
    public void notifyChanges() {

        for(Observer obs:subscribers){
            obs.notified();
        }
    }
}

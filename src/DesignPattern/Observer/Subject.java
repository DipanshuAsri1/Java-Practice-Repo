package DesignPattern.Observer;

public interface Subject {

    void subscribe(Observer obs);
    void unsubscribe(Observer obs);
    void notifyChanges();

}

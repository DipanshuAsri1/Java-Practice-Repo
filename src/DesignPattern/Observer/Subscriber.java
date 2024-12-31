package DesignPattern.Observer;

public class Subscriber implements Observer{

    private String name;
    Subscriber(String name){
        this.name=name;
    }


    @Override
    public void notified() {
        System.out.println("Hi "+name+"New video uploaded");
    }
}

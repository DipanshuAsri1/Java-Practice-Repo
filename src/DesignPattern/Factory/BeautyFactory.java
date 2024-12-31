package DesignPattern.Factory;

public class BeautyFactory implements Creator{


    @Override
    public Product factoryMenthod() {
        return new Beauty();
    }
}

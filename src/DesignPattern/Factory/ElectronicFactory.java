package DesignPattern.Factory;

public class ElectronicFactory implements Creator {
    @Override
    public Product factoryMenthod() {
        return new Electronic();
    }
}



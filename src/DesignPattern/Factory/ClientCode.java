package DesignPattern.Factory;

public class ClientCode {

    public static void main(String[] args) {

        ElectronicFactory electronicFactory = new ElectronicFactory();
        Product electronicProduct = electronicFactory.factoryMenthod();
        electronicProduct.display();

        BeautyFactory beautyFactory = new BeautyFactory();
        Product beautProduct = beautyFactory.factoryMenthod();
        beautProduct.display();

    }
}

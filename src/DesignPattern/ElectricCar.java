package DesignPattern;

/**
 * It breals liskov as electric car does not use engine.
 */
public class ElectricCar implements Car{
    @Override
    public String TypeOfengine() {
        return "No engine";
    }

    @Override
    public int topSpeed() {
        return 200;
    }
}

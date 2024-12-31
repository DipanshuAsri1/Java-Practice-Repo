package DesignPattern;


public class MotorCar implements Car{
    @Override
    public String TypeOfengine() {
        return "Motor car : Double chassis";
    }

    @Override
    public int topSpeed() {

        return 300;
    }
}

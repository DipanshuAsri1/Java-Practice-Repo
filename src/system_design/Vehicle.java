package system_design;

import java.util.ArrayList;

public abstract class Vehicle {

    protected String licensePlate;
    protected int noOfSpotsNeeded;
    protected VehicleSize size;

    protected ArrayList parkingSpots = new ArrayList();

    public int getNoOfSpotsNeeded() {
        return noOfSpotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }


}

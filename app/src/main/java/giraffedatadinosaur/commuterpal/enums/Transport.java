package giraffedatadinosaur.commuterpal.enums;

import io.urbanthings.api.transit.model.VehicleType;

/**
 * Created by Jack Treble on 18/03/2017.
 */

public enum Transport {
    CAR("Car", VehicleType.CAR),
    BUS("Bus", VehicleType.BUS),
    TRAIN("Train", VehicleType.RAIL),
    BIKE("Bike", VehicleType.CYCLEOWNED),
    WALK("Walk", VehicleType.WALKING);

    private final VehicleType vehicleType;

    private final String name;

    Transport(String name, VehicleType vehicleType){
        this.name = name;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString(){
        return name;
    }

    public VehicleType toApiType(){
        return vehicleType;
    }

    public int toApiInt(){
        return toApiType().getValue();
    }
}

package giraffedatadinosaur.commuterpal.enums;

/**
 * Created by Jack Treble on 18/03/2017.
 */

public enum Transport {
    CAR("Car"),
    BUS("Bus"),
    TRAIN("Train"),
    BIKE("Bike"),
    WALK("Walk");


    private String name;

    Transport(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}

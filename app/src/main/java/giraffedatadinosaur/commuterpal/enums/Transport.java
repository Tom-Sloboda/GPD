package giraffedatadinosaur.commuterpal.enums;

/**
 * Created by Jack Treble on 18/03/2017.
 */

public enum Transport {
    CAR("car"), BUS("bus"), TRAIN("train"), BIKE("bike"),
    WALK("bike");


    private String name;

    Transport(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

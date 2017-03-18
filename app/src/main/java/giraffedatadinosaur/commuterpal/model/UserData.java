package giraffedatadinosaur.commuterpal.model;

import org.joda.time.LocalTime;

import giraffedatadinosaur.commuterpal.enums.Transport;
import io.urbanthings.api.transit.model.DirectionsRequest;
import io.urbanthings.api.transit.model.PlacePoint;

/**
 * Created by Daniel on 18/03/2017.
 */

public class UserData {

    private static final UserData data = new UserData();

    private PlacePoint home;

    private PlacePoint work;

    private Transport mode;

    private LocalTime arrivalToWork;

    private LocalTime departureTime;

    public static UserData instance(){
        return data;
    }

    public PlacePoint getHome() {
        return home;
    }

    public void setHome(PlacePoint home) {
        this.home = home;
    }

    public PlacePoint getWork() {
        return work;
    }

    public void setWork(PlacePoint work) {
        this.work = work;
    }

    public Transport getMode() {
        return mode;
    }

    public void setMode(Transport mode) {
        this.mode = mode;
    }

    public LocalTime getArrivalToWork() {
        return arrivalToWork;
    }

    public void setArrivalToWork(LocalTime arrivalToWork) {
        this.arrivalToWork = arrivalToWork;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DirectionsRequest getToWorkRequest(){
        DirectionsRequest directionRequest = new DirectionsRequest();
        directionRequest.setOrigin(home);
        directionRequest.setDestination(work);
        directionRequest.setArrivalTime(arrivalToWork.toDateTimeToday().toDate());
        return directionRequest;
    }

    public DirectionsRequest getToHomeRequest(){
        DirectionsRequest directionRequest = new DirectionsRequest();
        directionRequest.setOrigin(work);
        directionRequest.setDestination(home);
        directionRequest.setDepartureTime(departureTime.toDateTimeToday().toDate());
        return directionRequest;
    }
}

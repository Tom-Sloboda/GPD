package giraffedatadinosaur.commuterpal.frontend.api;

/**
 * Created by Daniel on 18/03/2017.
 */

public interface FrontEndNotifications {

    String getDepartureTime();

    String getArrivalTime();

    String getDepartureLocation();

    String getArrivalLocation();

    String isDelayed();

}

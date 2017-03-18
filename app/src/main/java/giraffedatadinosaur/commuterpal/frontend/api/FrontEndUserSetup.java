package giraffedatadinosaur.commuterpal.frontend.api;


import com.google.common.base.Optional;

import org.joda.time.LocalTime;

import giraffedatadinosaur.commuterpal.callback.Suggestions;
import io.urbanthings.api.transit.model.VehicleType;

/**
 * Created by Daniel on 18/03/2017.
 */

public interface FrontEndUserSetup {
    /**
     * Provides address, returns suggestions if unfound address
     * @param address
     * @return
     */
    Optional<Suggestions<String>> setHomeAddress(String address);

    /**
     * Provides address, returns suggestions if unfound address
     * @param address
     * @return
     */
    Optional<Suggestions<String>> setWorkAddress(String address);

    /**
     * Mode of transport
     * @param vehicleType
     */
    void setMode(VehicleType vehicleType);

    /**
     * Time of arrival
     * @param time
     */
    void setArrivalTime(LocalTime time);

    /**
     * Time of departure
     * @param time
     */
    void setDepartureTime(LocalTime time);

}

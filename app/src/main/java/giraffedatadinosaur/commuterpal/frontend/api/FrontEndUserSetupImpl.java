package giraffedatadinosaur.commuterpal.frontend.api;


import com.google.common.base.Optional;

import org.joda.time.LocalTime;

import giraffedatadinosaur.commuterpal.callback.Suggestions;
import giraffedatadinosaur.commuterpal.enums.Transport;
import giraffedatadinosaur.commuterpal.helpers.ResolvePlacePointFromAddress;
import giraffedatadinosaur.commuterpal.helpers.resolve.ResolveException;
import giraffedatadinosaur.commuterpal.model.UserData;
import io.urbanthings.api.transit.model.PlacePoint;

/**
 * Created by Daniel on 18/03/2017.
 */

public class FrontEndUserSetupImpl implements FrontEndUserSetup {

    private final ResolvePlacePointFromAddress addressResolver = new ResolvePlacePointFromAddress();

    public Optional<Suggestions<String>> setHomeAddress(String address){
        try {
            PlacePoint place = addressResolver.resolve(address);
            UserData.instance().setHome(place);
        }catch(ResolveException e){
            return Optional.absent();
        }
        return Optional.absent();
    }

    public Optional<Suggestions<String>> setWorkAddress(String address){
        try {
            PlacePoint place = addressResolver.resolve(address);
            UserData.instance().setWork(place);
        }catch(ResolveException e){
            return Optional.absent();
        }
        return Optional.absent();
    }

    public void setArrivalTime(LocalTime time){
        UserData.instance().setArrivalToWork(time);
    }

    public void setDepartureTime(LocalTime time){
        UserData.instance().setDepartureTime(time);
    }

    public void setMode(Transport vehicleType){
        UserData.instance().setMode(vehicleType);
    }

}

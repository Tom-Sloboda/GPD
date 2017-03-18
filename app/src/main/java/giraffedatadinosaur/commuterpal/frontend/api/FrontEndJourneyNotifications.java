package giraffedatadinosaur.commuterpal.frontend.api;

import giraffedatadinosaur.commuterpal.helpers.resolve.ResolveException;
import giraffedatadinosaur.commuterpal.helpers.resolve.Resolver;
import giraffedatadinosaur.commuterpal.model.UserData;
import io.urbanthings.api.transit.model.Journey;

/**
 * Created by Daniel on 18/03/2017.
 */

public class FrontEndJourneyNotifications implements FrontEndNotifications {

    private final Resolver<UserData, Journey> responseResolver;

    public FrontEndJourneyNotifications(Resolver<UserData, Journey> responseResolver){
        this.responseResolver = responseResolver;
    }

    public String getDepartureTime(){
        try{
            return responseResolver.resolve(UserData.instance()).getDepartureTime().toString();
        }catch(ResolveException e){
            return "Unknown";
        }
    }

    public String getArrivalTime(){
        try{
            return responseResolver.resolve(UserData.instance()).getArrivalTime().toString();
        }catch(ResolveException e){
            return "Unknown";
        }
    }

    public String getDepartureLocation(){
        try{
            return responseResolver.resolve(UserData.instance()).getOriginPlacePointID();
        }catch(ResolveException e){
            return "Unknown";
        }
    }

    public String getArrivalLocation(){
        try{
            return responseResolver.resolve(UserData.instance()).getDestinationPlacePointID();
        }catch(ResolveException e){
            return "Unknown";
        }
    }

    public String isDelayed(){
        return "False";
    }
}

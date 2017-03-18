package giraffedatadinosaur.commuterpal.helpers;

import java.util.List;

import giraffedatadinosaur.commuterpal.helpers.resolve.ResolveException;
import giraffedatadinosaur.commuterpal.helpers.resolve.Resolver;
import io.urbanthings.api.transit.model.PlacePoint;
import io.urbanthings.api.transit.model.PlacePointList;

/**
 * Created by Daniel on 18/03/2017.
 */

public class ResolvePlacePointFromAddress implements Resolver<String, PlacePoint>{

    public PlacePoint resolve(String address) throws ResolveException{
        FutureApiCallback<PlacePointList> callback = new FutureApiCallback<>();
        TransactionHolder.resolveAddressPoints(address, callback);

        List<PlacePoint> places = callback.getResult().getPlacePoints();

        if(places.isEmpty()){
            throw new ResolveException("No places could be resolved");
        }

        return places.get(0);
    }

}

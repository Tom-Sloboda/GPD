package giraffedatadinosaur.commuterpal.helpers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import giraffedatadinosaur.commuterpal.helpers.resolve.ResolveException;
import giraffedatadinosaur.commuterpal.helpers.resolve.Resolver;
import giraffedatadinosaur.commuterpal.model.UserData;
import io.urbanthings.api.transit.model.DirectionsResponse;
import io.urbanthings.api.transit.model.Journey;

/**
 * Created by Daniel on 18/03/2017.
 */

public class ToHomeJourneyResolver implements Resolver<UserData, Journey> {

    public Journey resolve(UserData input) throws ResolveException{
        FutureApiCallback<DirectionsResponse> callback = new FutureApiCallback<>();

        TransactionHolder.resolveDirectionResponse(input.getToHomeRequest(), callback);
        List<Journey> journeys = callback.getResult().getJourneys();
        Collections.sort(journeys, new Comparator<Journey>() {
            @Override
            public int compare(Journey o1, Journey o2) {
                return o1.getArrivalTime().compareTo(o2.getArrivalTime());
            }
        });
        return journeys.get(0);
    }
}

package giraffedatadinosaur.commuterpal.helpers;

import io.urbanthings.api.ApiCallback;
import io.urbanthings.api.transit.TransitApi;
import io.urbanthings.api.transit.TransitApiManager;
import io.urbanthings.api.transit.model.PlacePointList;

/**
 * Created by Daniel on 18/03/2017.
 */

public class TransactionHolder {
    private static final String BASE_URL = "https://bristol.api.urbanthings.io/api/1.0/";
    private static final String API_KEY = "mmnExndmAUqSnYepdc6Gug";
    private static final Double LAT = 51.468575;
    private static final Double LONG = -2.6607488;

    public static TransitApi resolve() {
        return TransitApiManager.transitApi(BASE_URL, API_KEY);
    }

    public static void resolveStops(ApiCallback<PlacePointList> callback) {
        resolve().getPlacePointsInRect(LAT, LONG, 10000, "2", 1000, callback);
    }

    public static void resolveAddressPoints(String address, ApiCallback<PlacePointList> callback) {
        resolve().searchPlacePoints(address, LAT, LONG, 1, callback);
    }
}

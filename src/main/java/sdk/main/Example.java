package sdk.main;

import sdk.railways.ApiClient;
import sdk.railways.api.DistanceApi;

public class Example {

    private DistanceApi distanceApi;

    public Example(int idKey) {
        //Don't forget to set your API key in the ApiClient & pass it to an argument to the APIs you wish to use (as done below)!
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(String.valueOf(idKey));

        distanceApi = new DistanceApi(apiClient);
    }

    public double distanceBetween(int stationA, int stationB) {
        return distanceApi.getDistanceBetweenStations(stationA, stationB)
                .block()
                .getDistance();
    }
}

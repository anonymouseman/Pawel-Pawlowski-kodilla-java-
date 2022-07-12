package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Set;

public class SearchFlight {
    private static boolean checkIfExistsOnMap (Set<String> airportSet, String comparedAirport) {
        boolean isOnMap = airportSet.stream()
                .anyMatch(n -> n.equals(comparedAirport));
        System.out.println(comparedAirport + " <<---- exists on map: " + isOnMap);
        return isOnMap;
    }
    public final void findFlight(Flight flight) throws RouteNotFoundException {

        final HashMap<String, Boolean> availability = new HashMap<>();
        availability.put("London", true);
        availability.put("Warsaw", true);
        availability.put("Canada", false);
        availability.put("Jamaica", true);
        availability.put("Rome", true);
        availability.put("Berlin", true);


        if (checkIfExistsOnMap(availability.keySet(), flight.arrivalAirport) && checkIfExistsOnMap(availability.keySet(), flight.departureAirport)) {
            System.out.println("System continues to work..");
        } else {
            throw new RouteNotFoundException("no such airport on map");
        }
    }
    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();

        try {
            searchFlight.findFlight(new Flight("Warsaw", "Madrid"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
        System.out.println("And we are still running.");
        System.out.println();

        try {
            searchFlight.findFlight(new Flight("Warsaw", "Paris"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
        System.out.println("And we are still running.");
        System.out.println();

        try {
            searchFlight.findFlight(new Flight("Warsaw", "Rome"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
        System.out.println("And we are still running.");
    }

}

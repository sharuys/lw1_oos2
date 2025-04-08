package factory;

import java.util.List;

public class AircraftSentenceFactory {

    public static AircraftSentence createSentence(List<Object> aircraft) {
        String icao24 = (String) aircraft.get(0);
        String callsign = (String) aircraft.get(1);
        String originCountry = (String) aircraft.get(2);
        Double longitude = aircraft.get(5) instanceof Double ? (Double) aircraft.get(5) : 0.0;
        Double latitude = aircraft.get(6) instanceof Double ? (Double) aircraft.get(6) : 0.0;
        Double geoAltitude = aircraft.get(13) instanceof Double ? (Double) aircraft.get(13) : 0.0;

        String sentence = String.format(
                "Aircraft %s (%s) from %s at [%.2f, %.2f] altitude %.2f m",
                icao24, callsign, originCountry,
                latitude, longitude, geoAltitude
        );

        return new AircraftSentence(sentence);
    }
}
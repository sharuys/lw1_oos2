package sensor;

import server.PlaneDataServer;
import factory.AircraftSentence;

public class Sensor {
    private PlaneDataServer planeDataServer;

    public Sensor(PlaneDataServer planeDataServer) {
        this.planeDataServer = planeDataServer;
    }

    public void processSentence(String sentence) {
        AircraftSentence aircraftSentence = new AircraftSentence(sentence);
    }
}
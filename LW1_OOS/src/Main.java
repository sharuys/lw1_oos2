import factory.AircraftSentenceFactory;
import server.PlaneDataServer;
import jsonstream.JsonStreamReader;

public class Main {
    public static void main(String[] args) {
        PlaneDataServer server = new PlaneDataServer(new JsonStreamReader());

        for (int i = 0; i < 5; i++) {
            var aircraftList = server.readData();

            for (var aircraft : aircraftList) {
                var sentence = AircraftSentenceFactory.createSentence(aircraft);
                System.out.println(sentence);
            }

            try {
                Thread.sleep(1000); // чтобы красиво по времени!!!!!
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
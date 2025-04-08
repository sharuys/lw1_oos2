package jsonstream;

import java.util.*;

public class JsonStreamReader {

    private final String url;

    public JsonStreamReader(String url) {
        this.url = url;
    }

    public JsonStreamReader() {
        this.url = null;
    }

    public List<Object> read() {
        // Симуляция ответа от сервера
        List<Object> data = new ArrayList<>();

        List<List<Object>> states = new ArrayList<>();

        // Добавим фейковые самолёты
        for (int i = 0; i < 3; i++) {
            List<Object> aircraft = new ArrayList<>();
            aircraft.add("icao" + i);             // 0 - icao24
            aircraft.add("CALL" + i);             // 1 - callsign
            aircraft.add("Country" + i);          // 2 - origin country
            aircraft.add(null);                   // 3
            aircraft.add(null);                   // 4
            aircraft.add(10.0 + i);               // 5 - longitude
            aircraft.add(50.0 + i);               // 6 - latitude
            aircraft.add(null);                   // ...
            aircraft.add(null);
            aircraft.add(null);
            aircraft.add(null);
            aircraft.add(null);
            aircraft.add(null);
            aircraft.add(1000.0 + i * 500);

            states.add(aircraft);
        }

        data.add(states);

        return data;
    }
}
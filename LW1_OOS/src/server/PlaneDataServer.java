package server;

import jsonstream.JsonStreamReader;
import java.util.*;

public class PlaneDataServer {

    private final JsonStreamReader reader;

    public PlaneDataServer(JsonStreamReader reader) {
        this.reader = reader;
    }

    public List<List<Object>> readData() {
        List<Object> json = reader.read();
        if (json.isEmpty()) return new ArrayList<>();

        return (List<List<Object>>) json.get(0);
    }
}
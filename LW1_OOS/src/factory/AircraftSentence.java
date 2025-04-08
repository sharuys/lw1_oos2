package factory;

public class AircraftSentence {
    private String sentenceData;

    public AircraftSentence(String sentenceData) {
        this.sentenceData = sentenceData;
    }

    public String getSentenceData() {
        return sentenceData;
    }

    @Override
    public String toString() {
        return sentenceData;
    }
}
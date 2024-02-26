package com.driver;

public class Microphone {
    private String id;
    private int frequencyResponse;

    public Microphone(String id, int frequencyResponse) {
        this.id = id;
        this.frequencyResponse = frequencyResponse;
    }

    public String getId() {
        return id;
    }

    public int getFrequencyResponse() {
        return frequencyResponse;
    }

    @Override
    public String toString() {
        return "Microphone [ID=" + id + ", FrequencyResponse=" + frequencyResponse + "Hz]";
    }
}
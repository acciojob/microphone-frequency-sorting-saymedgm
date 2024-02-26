package com.driver;

public class Microphone {
    private String id;
    private int frequencyResponse;

    public Microphone(String id, int frequencyResponse) {
        // your code goes here
    }

    public String getId() {
    	// your code goes here
        return id;
    }

    public int getFrequencyResponse() {
    	// your code goes here
        return frequencyResponse;
    }

    @Override
    public String toString() {
    	// your code goes here
        return "Microphone [ID=" + id + ", FrequencyResponse=" + frequencyResponse + "Hz]";
    }
}

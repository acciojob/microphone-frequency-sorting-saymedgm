package com.driver;

import java.util.Comparator;

public class MicrophoneComparator implements Comparator<Microphone> {
	public int compare(Microphone mic1, Microphone mic2) {
		int freqCompare = Integer.compare(mic1.getFrequencyResponse(), mic2.getFrequencyResponse());
		if (freqCompare == 0) {
			return mic1.getId().compareTo(mic2.getId());
		}
		return freqCompare;
	}
}
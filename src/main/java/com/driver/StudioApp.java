package com.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudioApp {
	  public static void main(String[] args) {
	        List<Microphone> mics = new ArrayList<Microphone>();
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of microphones:");
	        int count = scanner.nextInt();
	        
	        for (int i = 0; i < count; i++) {
	            System.out.println("Enter microphone ID and frequency response (in Hz):");
	            String id = scanner.next();
	            int freq = scanner.nextInt();
	            mics.add(new Microphone(id, freq));
	        }

	        Collections.sort(mics, new MicrophoneComparator());

	        System.out.println("Sorted microphones:");
	        for (Microphone mic : mics) {
	            System.out.println(mic);
	        }
	    }
}

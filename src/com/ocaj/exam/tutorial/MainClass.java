package com.ocaj.exam.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String planet = System.console().readLine("\nEnter your favourite planet: ");
		//Work Around Eclipse
		System.out.print("\nEnter your favourite planet: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String planet=null;
		try {
			planet = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> planetList = new ArrayList<String>();
		planetList.add(planet);
		planetList.add("Gliese 581 c");
		System.out.println("\nTwo cool planets: " + planetList);
	}

}

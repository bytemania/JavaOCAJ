package com.ocaj.exam.chapter2;

import java.util.ArrayList;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Float> fishLenghtList = new ArrayList<Float>();
		fishLenghtList.add(new Float(10.0));
		fishLenghtList.add(new Float(15.5));
		fishLenghtList.add(new Float(18.0));
		fishLenghtList.add(new Float(29.5));
		fishLenghtList.add(new Float(45.5));

		System.out.print("\nInches:");
		for (Float f : fishLenghtList)
			if (f > 28)
				System.out.print(" " + f);

	}

}

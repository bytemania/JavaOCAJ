package com.ocaj.exam.chapter2;

public class SwitchStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String value = "TwoHundred";
		switch(value){
			case "OneHundred":
				System.out.println("OneHundred Choosed");
				break;
			case "TwoHundred":
				System.out.println("TwoHundred Choosed");
				break;
			case "ThreeHundred":
				System.out.println("ThreeHundred Choosed");
				break;
			default:
				System.out.println("Default");
		}
	}

}

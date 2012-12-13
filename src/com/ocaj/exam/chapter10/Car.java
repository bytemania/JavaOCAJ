package com.ocaj.exam.chapter10;

public class Car {
	Wheel[] wheel = new Wheel[4];
	
	public void setWheels(Wheel w){
		wheel[0] = w;
		wheel[1] = w;
		wheel[2] = w;
		wheel[3] = w;
	}
}

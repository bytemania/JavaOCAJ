package com.ocaj.exam.chapter10;

public class CarComputer {

	SensorStatus[] sensorStatus = new SensorStatus[5];
	
	public CarComputer(){
		sensorStatus[0] = new SensorStatus(1);
		sensorStatus[1] = new SensorStatus(1);
		sensorStatus[2] = new SensorStatus(1);
		sensorStatus[3] = new SensorStatus(1);
		sensorStatus[4] = new SensorStatus(1);
	}
	
}

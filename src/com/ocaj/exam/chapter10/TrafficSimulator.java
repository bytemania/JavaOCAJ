package com.ocaj.exam.chapter10;

public class TrafficSimulator {
	CarWithLights[] cars = new CarWithLights[3];
	TrafficLight[] trafficLights = new TrafficLight[8];
	
	public static void main(String[] args){
		new TrafficSimulator();
	}
	
	public TrafficSimulator(){
		for(int i=0; i < trafficLights.length; i++){
			trafficLights[i] = new TrafficLight(i);
		}
		
		cars[0] = new CarWithLights(trafficLights);
		cars[1] = new CarWithLights(trafficLights);
		cars[2] = new CarWithLights(trafficLights);
	}
	
}

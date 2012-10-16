package com.ocaj.exam.tutorial;

import com.ocaj.exam.tutorial.planets.Earth;
import com.ocaj.exam.tutorial.planets.Mars;
import com.ocaj.exam.tutorial.planets.Venus;

public class GreetingsUniverse {
  public static void main(String[] args){
    System.out.println("Greetings, Universe!");
    Earth e = new Earth();
    Venus v = new Venus();
    Mars m= new Mars(); 
  }
}


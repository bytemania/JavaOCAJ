package com.ocaj.exam.chapter3;

public class StringExamples {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float reale = .007812f;
		float escudo = .0125f;
		
		String quote = "Dead Men Tell No Tales";
		String rquote = quote.replace("No Tales", "Tales");
				
		System.out.println("Replaced Quote:" + rquote);
		
		System.out.println("Quote:" + quote);
		
		System.out.println(reale  + escudo + "% of one gold doubloon");
	
		System.out.println((reale  + escudo) + "% of one gold doubloon");
	
		System.out.println("% of one gold doubloon " + (reale +escudo));
	
		System.out.println("% of one gold doubloon " + reale +escudo);
		
		String item = "doubloon";
		String question = "What is a " + item + "? ";
		System.out.println("Question: " + question);
		
		
		String title1 = " shovels.";
		String title2 = "Shovels: ";
		
		int flatShovels = 5;
		int roundPointShovels = 6;
		
		System.out.println(flatShovels + roundPointShovels + title1);
		
		System.out.println((flatShovels + roundPointShovels) + title1);
		
		System.out.println(title2 + flatShovels + roundPointShovels);
		
		System.out.println(title2 + (flatShovels + roundPointShovels));
		
	}

}

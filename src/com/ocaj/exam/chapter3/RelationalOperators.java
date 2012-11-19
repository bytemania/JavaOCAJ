package com.ocaj.exam.chapter3;

public class RelationalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b1 = 1 <  2;
		boolean b2 = 3 <  2;
		boolean b3 = 3 >  2;
		boolean b4 = 1 >  2;
		boolean b5 = 2 <= 2;
		boolean b6 = 3 <= 2;
		boolean b7 = 3 >= 3;
		boolean b8 = 2 >= 3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		
		b1 = 'A' < 'B';
		b2 = '\u0041' < '\u0042';
		b3 = 0x0041 < 0x0042;
		b4 = 65 < 66;
		b5 = 0101 < 0102;
		b6 = '\101' < '\102';
		b7 = 'A' < 0102;
		
		System.out.println("Other types");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		
		b1 = 9.00D < 9.50D;
		b2 = 9.00d < 9.50d;
		b3 = 9.00F < 9.50F;
		b4 = 9.0f  < 9.50f;
		b5 = (double)9 < (double)10;
		b6 = (float)9 < (float)10;
		b7 = 9 < 10;
		b8 = (9d < 10f);
		boolean b9 = (float) 11 < 12;
		
		System.out.println("PostFixes and Casts");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
	}

}

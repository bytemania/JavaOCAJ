package com.ocaj.exam.chapter3;

public class EqualityOperatorsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value = 12;
		System.out.println(true == true);
		System.out.println('a' != 'a');
		System.out.println((byte)value == (byte)value);
		System.out.println((short)value == (short)value);
		System.out.println(value == value);
		System.out.println(12F == 12f);
		System.out.println(12D != 12d);
		
		System.out.println("Instances");
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
		
		System.out.println(a != b);
		System.out.println(a != c);		
		System.out.println(b != c);	
	}
	

}

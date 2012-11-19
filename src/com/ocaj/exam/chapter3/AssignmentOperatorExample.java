package com.ocaj.exam.chapter3;

public class AssignmentOperatorExample {

	/**
	 * @param args
	 * 
	 * -----------------------------------------
	 * a=10 	a+=3 	a=10+3 13
	 * a=15		a-=3	a=15-3 12
	 * a=20     a*=3    a=20*3 60
	 * a=25     a/=3    a=25/3 8
	 * a=30     a%=3    a=30%3 0
	 * a=35     a&=3    100011 
	 *                  000011 AND
	 *                  000011 3
	 * a=40     a^=3    101000         
	 *                  000011 XOR
	 *                  101011 43
	 * a=45     a|=3    101101   
	 *                  000011 OR
	 *                  101111 47
	 * a=50     a<<=3   00110010 <<
	 *                  10010000 
	 *                  -1101111
	 *                  -111 + 1 = -112
	 * a=55     a>>=3   00110111
	 *                  00000110 6
	 * a=60     a>>>=3  00111100 
	 *                  00000111 7                                      
	 */
	public static void main(String[] args) {
		byte a;
		a=10;
		System.out.println(a += 3);
		a=15;
		System.out.println(a -= 3);
		a=20;
		System.out.println(a *= 3);
		a=25;
		System.out.println(a /= 3);
		a=30;
		System.out.println(a %= 3);
		a=35;
		System.out.println(a &= 3);
		a=40;
		System.out.println(a ^= 3);
		a=45;
		System.out.println(a |= 3);
		a=50;
		System.out.println(a <<= 3);
		a=55;
		System.out.println(a >>= 3);
		a=60;
		System.out.println(a >>>= 3);
	}

}

/**
 * <h1> Literals </h1>
 * This program is to demonstrate literals in java
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13-Jan-2015
 */

import java.lang.*;
class Literals{
	public static void main(String args[]){
		int a = 021;	//octal initialization
		int b = 0xF2;	// hexadecimal initialization
		float c = 9.36f; // float initialization
		System.out.println("a= " + a + " b= " + b + " c= " + c);
		// boolean d = 0; not working
		boolean d = true;  // boolean initialization
		char e = 'a';
		System.out.println("d= " + d + " e= " + e);
		++e;
		System.out.println("++e= " + e);
		double f = Math.sqrt(4.8 * 5.6); // dynamic initialization
		System.out.println(f);
	}
}

/* Compilation adn result
 * [y13cse79@localhost 130115]$ javac Literals.java
 * [y13cse79@localhost 130115]$ java Literals
 * a= 17 b= 242 c= 9.36
 * d= true e= a
 * ++e= b
 * 5.184592558726288
 */

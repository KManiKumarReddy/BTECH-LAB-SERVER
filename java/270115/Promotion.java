/**
 *<h1>Type Promotion</h1>
 * Program to demonstrate type promotion
 *
 * @author Mani Kumar Reddy k 13b81a0579
 * @since 27-Jan-2015
 */

class Promotion{
	public static void main(String args[]){
		byte a=10,b=2,d;
		int c;
		c = a * b;
		//d = a*b;
		d = (byte)(a*b);
		System.out.println("c="+c);
		double d1= 86.78;
		float f = 90.7f;
		short s;
		//s = (a*b) + (c*f)/2 + d1;
		s = (short)((a*b) + (c*f)/2 + d1);
		System.out.println("s =" + s);
	}
}

/* Compilation and output:
[y13cse79@localhost 270115]$ javac Promotion.java
[y13cse79@localhost 270115]$ java Promotion
c=20
s =1013
*/

/**
 * <h1>Implicit Type conversions</h1>
 * This program demonstrates implicit type conversions
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 27-Jan-2015
 */

class Implicit{
	public static void main(String args[]){
		boolean b = true;
		int i = 0;
		//b = i; incompatible types error
		//i = b; incompatible types error
		char c = 'A';
		//c = i; possible loss of precision
		double d = 87.89;
		d = i;
		System.out.println("d= " +d);
		//i = d; possible loss of precision error
		byte b1 = 8;
		//b1 = i; possible loss of precision error
	}
}

/*Compilation and output: before removing errors
"Implicit.java" [New] 24L, 399C written
[y13cse79@localhost 270115]$ javac Implicit.java
Implicit.java:13: error: incompatible types
                b = i;
                    ^
  required: boolean
  found:    int
Implicit.java:14: error: incompatible types
                i = b;
                    ^
  required: int
  found:    boolean
Implicit.java:16: error: possible loss of precision
                c = i;
                    ^
  required: char
  found:    int
Implicit.java:20: error: possible loss of precision
                i = d;
                    ^
  required: int
  found:    double
Implicit.java:22: error: possible loss of precision
                b1 = i;
                    ^
  required: byte
  found:    int
5 errors
*/

/*
 * Compilation and output after removing errors
 [y13cse79@localhost 270115]$ javac Implicit.java
[y13cse79@localhost 270115]$ java Implicit
d= 0.0
*/

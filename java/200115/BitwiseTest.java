/**
 * <h1>Bitwise operators</h1>
 * This program demonstrates bitwise operators in java
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 20-Jan-2015
 */

class BitwiseTest{
	public static void main(String args[]){
		int a = 6, b = 4, c;
		c = a & b;
		System.out.println("a&b="+c);  // 4
		c = a | b;
		System.out.println("a|b="+c);  // 6
		c = a ^ b;
		System.out.println("a^b="+c);  // 2
		c = ~a;
		System.out.println("~a="+c);   // -7
		int d = a>>1;
		System.out.println("a>>1="+d); // 3
		int e = -4;
		e >>>= 1;
		System.out.println("-4 >>> 1 = "+e);   // 324...
		int f = 9 << 2;
		System.out.println(" 9 << 2 =" +f);   // 36
		
	}
}

/* Compilation and Result:
 [y13cse79@localhost 200115]$ javac Bitwise.java
[y13cse79@localhost 200115]$ java Bitwise
a&b=4
a|b=6
a^b=2
~a=-7
a>>1=3
-4 >>> 1 = 2147483646
 9 << 2 =36
*/

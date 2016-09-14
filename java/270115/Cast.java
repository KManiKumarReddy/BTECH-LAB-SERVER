/**
 * <h1>Type casting</h1>
 * program to demonstrate type casting
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 27-Jan-2015
 */

class Cast
{
	public static void main(String args[]){
		byte b;
		int i=98;
		b=(byte)i;
		System.out.println("b="+b);
		i=127;
		b=(byte)i;
		System.out.println("b="+b);
		i=128;
		b=(byte)i;
		System.out.println("b="+b);
		i=356;
		b=(byte)i;
		System.out.println("b="+b);
		i=456;
		b=(byte)i;
		System.out.println("b="+b);
		double d=186.75;
		i=(int)d;
		System.out.println("i="+i);
		char c = (char)i;
		System.out.println("c = " + c);
		i = 'a';
		System.out.println("i= " + i);
	}
}
/*Compilation and result:

calhost 270115]$ javac Cast.java
[y13cse79@localhost 270115]$ java Cast
b=98
b=127
b=-128
b=100
b=-56
i=186
c = ?
i= 97
*/

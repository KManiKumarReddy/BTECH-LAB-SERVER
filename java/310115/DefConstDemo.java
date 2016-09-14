/**
 * <h1>Default Constructor</h1>
 * Program to demonstrate default constructor
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 31-Jan-2015
 */

class DefConst{
	int i;
	float f;
	char c;
	double d;
	boolean b;
}

class DefConstDemo{
	public static void main(String args[]){
		DefConst o = new DefConst();
		System.out.println("default int = " + o.i);
		System.out.println("default float = " + o.f);
		System.out.println("default double = " + o.d);
		System.out.println("default char = " + o.c);
		System.out.println("default boolean = " + o.b);
	}
}

/* Compilation and result:
"DefConstDemo.java" 27L, 562C written
[y13cse79@localhost 310115]$ javac DefConstDemo.java
[y13cse79@localhost 310115]$ java DefConstDemo
default int = 0
default float = 0.0
default double = 0.0
default char =
default boolean = false
*/	

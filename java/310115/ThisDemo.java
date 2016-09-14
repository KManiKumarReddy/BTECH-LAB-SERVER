/**
 * <h1>This variable</h1>
 * Program to demonstrate this variable in objects
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 31-Jan-2015
 */

class This{
	int i;
	This(){
		i = 10;
	}
	void test(){
		int i = 20;
		System.out.println("i=" + i);
		System.out.println("This.i before changing=" + this.i);
		this.i = 30;
	}
}

class ThisDemo{
	public static void main(String args[]){
		This o = new This();
		o.test();
		System.out.println("o.i = " + o.i);
	}
}

/* Compilation and Result:
[y13cse79@localhost 310115]$ java ThisDemo
i=20
This.i before changing=10
o.i = 30
*/

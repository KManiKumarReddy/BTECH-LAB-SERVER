/**
 * <h1>Override toString() and demo equals()</h1>
 *
 * @author Mani kumar reddy k 13b81A0579
 * @since 10-02-2015
 */

class A{
	int x, y;
	A(int i, int j){
		x = i;
		y = j;
	}
	public String toString(){
		return ("x = " + x + " y = " + y);
	}
}

class ToStringDemo{
	public static void main(String args[]){
		A o1 = new A(5, 6), o2 = new A(8, 9), o3;
		o3 = o2;
		System.out.println(o1);
		System.out.println(o2);
		String str = "abc" + o2;
		System.out.println(str);
		System.out.println("o1 equals o2 is: " + o1.equals(o2));
		System.out.println("o2 equals o3 is: " + o2.equals(o3));
	}
}

/* Compilation and Result:
[y13cse79@localhost 100215]$ javac ToStringDemo.java
[y13cse79@localhost 100215]$ java ToStringDemo

Before overriding toString():

A@5f3fde6e
A@5a24389c
abcA@5a24389c
o1 equals o2 is: false
o2 equals o3 is: true

After overriding toString():

x = 5 y = 6
x = 8 y = 9
abcx = 8 y = 9
o1 equals o2 is: false
o2 equals o3 is: true
*/

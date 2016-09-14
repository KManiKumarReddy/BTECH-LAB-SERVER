/**
 * <h1>Passing objects</h1>
 * Program to demonstrate passing objects using call by reference
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 31-Jan-2015
 */

class A{
	int i;
	A(int x){
		i = x;
	}
	void change(A o){
		o.i = i + o.i;
	}
}

class PODemo{
	public static void main(String args[]){
		A o1 = new A(10);
		A o2 = new A(20);
		System.out.println("o2.i before changing =" + o2.i);
		o1.change(o2);
		System.out.println("o2.i after changing =" + o2.i);
		return;
	}
}

/* Compilation and Result:
[y13cse79@localhost 310115]$ javac PODemo.java
[y13cse79@localhost 310115]$ java PODemo
o2.i before changing =20
o2.i after changing =30
*/

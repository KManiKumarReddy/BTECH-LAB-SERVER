/**
 * <h1>Call by value</h1>
 * Program to demonstrate passing primitive types using call by value
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 31-Jan-2015
 */

class CBV{
	void test(int i, int j){
		i++;
		j++;
		System.out.println("inside test, i=" + i + "j = " + j);
	}
}

class CBVDemo{
	public static void main(String args[]){
		CBV o = new CBV();
		int k = 5, l = 6;
		System.out.println("Before calling test, k = " + k + "l = " + l);
		o.test(k, l);
		System.out.println("After calling test, k = " + k + "l = " + l);
	}
}

/* Compilation and Result:
[y13cse79@localhost 310115]$ javac CBVDemo.java
[y13cse79@localhost 310115]$ java CBVDemo
Befor calling test, k = 5l = 6
inside test, i=6j = 7
After calling test, k = 5l = 6
*/

/**
 * <h1>Inheriting Constructors</h1>
 * Using constructors in inherited classes
 * and refering subclass to superclass variable
 *
 * @author Mani kumar Reddy K 13B81A0579
 * @since 210115
 */

class A{
	int i, j;
	A(int x,int y){
		i = x; j = y;
	}
	void displayA(){
		System.out.println(" i = " + i + " j = " + j);
	}
}
class B extends A{
	int k;
	B(int x, int y, int z){
		super(x, y);
		k = z;
	}
	void displayB(){
		displayA();
		System.out.println("K = " + k);
	}
}
class ConstInherit{
	public static void main(String args[]){
		A o1 = new A(5, 6);
		B o2 = new B(7, 8, 9);
		o1.displayA();
		o1 = o2;
		o1.displayB();
	}
}

/* cOmpilation and result:
Without using super class reference:
[y13cse79@localhost 210215]$ javac ConstInherit.java
[y13cse79@localhost 210215]$ java ConstInherit
 i = 5 j = 6
 i = 7 j = 8
K = 9

with using superclass reference:
[y13cse79@localhost 210215]$ javac ConstInherit.java
ConstInherit.java:36: error: cannot find symbol
                o1.displayB();
                  ^
  symbol:   method displayB()
  location: variable o1 of type A
1 error
*/

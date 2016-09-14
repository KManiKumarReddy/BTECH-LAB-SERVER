/**
 * <h1>Dynamic Method Dispatch</h1>
 * Demonstration of Dynamic Method Dispatch
 *
 * @author Mani Kumaer Reddy K 13B81A0579
 * @since 210215
 */

class A{
	void display(){
		System.out.println("in A");
	}
}

class B extends A{
	void display(){
		System.out.println("in B");
	}
}

class DMD{
	static void fun1(A o){
		o.display();
	}
	public static void main(String args[]){
		A o1 = new A();
		B o2 = new B();
		fun1(o1);
		fun1(o2);
		o1 = o2;
		fun1(o1);
	}
}
/* Compilation and Result:
[y13cse79@localhost 210215]$ javac DMD.java
[y13cse79@localhost 210215]$ java DMD
in A
in B
in B
*/

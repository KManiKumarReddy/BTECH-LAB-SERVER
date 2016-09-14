/**
 * <h1>Method Overriding</h1>
 * Overriding superclass method in subclass
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

class Override{
	public static void main(String args[]){
		A o1 = new A();
		B o2 = new B();
		o1.display();
		o2.display();
	}
}
/*
[y13cse79@localhost 210215]$ javac Override.java
[y13cse79@localhost 210215]$ java Override
in A
in B
*/

/**
 * <h1>Super with Methods</h1>
 * Using super keyword to refer super class methods in ambigous methods
 *
 * @author Mani Kumaer Reddy K 13B81A0579
 * @since 210215
 */

class A{
	int i;
	A(int x){
		i = x;
	}
	void display(){
		System.out.println("i = " + i);
	}
}

class B extends A{
	int j;
	B(int x, int y){
		super(x);
		j = y;
	}
	void display(){
		super.display();
		System.out.println("j = " + j);
	}
}

class SuperWithMethods{
	public static void main(String args[]){
		A o1 = new A(10);
		B o2 = new B(1, 2);
		o1.display();
		o2.display();
	}
}
/*
[y13cse79@localhost 210215]$ javac SuperWithMethods.java
[y13cse79@localhost 210215]$ java SuperWithMethods
i = 10
i = 1
j = 2
*/

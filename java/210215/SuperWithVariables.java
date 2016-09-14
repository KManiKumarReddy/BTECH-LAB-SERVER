/**
 * <h1>Super with Variables</h1>
 * Using super keyword to refer super class variables in ambigous variables
 *
 * @author Mani Kumaer Reddy K 13B81A0579
 * @since 210215
 */

class A{
	int i;
	A(int x){
		i = x;
	}
}

class B extends A{
	int i;
	B(int y){
		super(y);
		i = y + 10;
	}
	void sum(){
		int i = 5;
		this.i = i + 2;
		super.i = this.i * 2;
		System.out.println(super.i);
	}
}

class SuperWithVariables{
	public static void main(String args[]){
		A o1 = new A(10);
		B o2 = new B(5);
		System.out.println(o1.i);
		o2.sum();
		System.out.println(o2.i);
	}
}
/*
[y13cse79@localhost 210215]$ javac SuperWithVariables.java
[y13cse79@localhost 210215]$ java SuperWithVariables
10
14
7
*/

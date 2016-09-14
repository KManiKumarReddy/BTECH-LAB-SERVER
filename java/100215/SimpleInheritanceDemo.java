/**
 * <h1> Simple Inheritance </h1>
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 10-02-2015
 */

class A{
	int i,j;
	void disp(){
		System.out.println("i="+i+"j="+j);
	}
}

class B extends A{
	int k;
	void sum(){
		System.out.println(i+j+k);
	}
}

class SimpleInheritanceDemo{
	public static void main(String args[]){
		A o1 = new A();
		o1.i = 5;
		o1.j = 10;
		o1.disp();
		B o2 = new B();
		o2.i = 1;
		o2.j = 2;
		o2.k = 3;
		o2.sum();
		o2.disp();
	}
}
/*Compilation and Result:
i=5j=10
6
i=1j=2
*/

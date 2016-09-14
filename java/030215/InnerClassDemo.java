/**
 * <h1>Inner Class Demo<h1>
 * Demonstration of nested classes
 *
 * @author Mani kumar reddy k 13B81A0579
 * @since 03-02-2015
 */

class Outer{
	int i;
	Inner o3;
	Outer (int j){
		i=j;
		o3 = new Inner(10);
	}
	class Inner{
		int x;
		Inner(int y){
			x=y;
		}
		void display(){
			x=i+10;
			System.out.println("x="+x);
		}
	}
	void test(){
		//x=11;
		Inner o = new Inner(5);
		o.x=11;
		o.display();
	}
}
class InnerClassDemo{
	public static void main(String args[]){
		//Inner o1=new Inner(10);
		Outer o2 = new Outer(20);
		o2.i=20;
		o2.test();
		o2.o3.display();
	}
}

/* Output:
[y13cse79@localhost 030215]$ javac InnerClassDemo.java
[y13cse79@localhost 030215]$ java InnerClassDemo
x=30
x=30
*/

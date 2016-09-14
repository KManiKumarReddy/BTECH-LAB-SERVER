/**
 * <h1> Inner Block Demo </h1>
 * Declaring an class inside a block demo
 *
 * @author Mai Kumar Reddy K 13B81A0579
 * @since 030215
 */
 

class innerblock{
	int i=10;
	void test(){
	for(int j=0;j<5;j++){
		class inner2
		{
			void display(){		
				System.out.println(i);
		}
	}
	inner2 in =new inner2();
	in.display();
}
}
}
class InnerBlockDemo{
	public static void main(String args[]){
		innerblock o=new innerblock();
		o.test();
	}
}
/* Compilation and Result:
[y13cse79@localhost 030215]$ javac InnerBlockDemo.java
[y13cse79@localhost 030215]$ java InnerBlockDemo
10
10
10
10
10
*/

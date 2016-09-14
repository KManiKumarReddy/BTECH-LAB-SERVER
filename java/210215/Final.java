/**
 * <h1>Final methods and classes</h1>
 * Demonstration of final methods and classes
 *
 * @author Mani Kumaer Reddy K 13B81A0579
 * @since 210215
 */

final class A{
	int i;
	A(int x){
		i = x;
	}
	void display(){
		System.out.println(i);
	}
}

class B extends A{
	B(int y){
		super(y);
	}
	void display(){
		System.out.println(i);
	}
}
/*Compilation:
with only method as final:
[y13cse79@localhost 210215]$ javac Final.java
Final.java:23: error: display() in B cannot override display() in A
        void display(){
             ^
  overridden method is final
1 error

with class as final:
localhost 210215]$ javac Final.java
Final.java:19: error: cannot inherit from final A
class B extends A{
                ^
1 error
*/

/**
 * <h1> Introduction to Generics </h1>
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 100315
 */

class Gen<T>{
	T ob;
	Gen(T ob1){
		ob = ob1;
	}
	T getOb(){
		return ob;
	}
	void showType(){
		System.out.println("class of ob = " + ob.getClass().getName());
	}
}
class GenDemo{
	public static void main(String args[]){
		// AutoBoxing
		Gen<Integer> iOb = new Gen<Integer>(10);
		iOb.showType();
		// Unboxing
		int i = iOb.getOb();
		System.out.println(i);

		Gen<String> sOb = new Gen<String>("abc");
		sOb.showType();
		String st = sOb.getOb();
		System.out.println(st);

		//iOb = sOb; // type safety demo.. shows error
	}
}

/* Compilation and result:
With error line

[y13cse79@localhost 100315]$ javac GenDemo.java
GenDemo.java:34: error: incompatible types
                iOb = sOb; // type safety demo.. shows error
                      ^
  required: Gen<Integer>
  found:    Gen<String>
1 error


After commenting error line:

[y13cse79@localhost 100315]$ javac GenDemo.java
[y13cse79@localhost 100315]$ java GenDemo
class of ob = java.lang.Integer
10
class of ob = java.lang.String
abc
*/

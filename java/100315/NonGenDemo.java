/**
 * <h1> Introduction to Generics Without Type parameters </h1>
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 100315
 */

class NonGen{
	Object ob;
	NonGen(Object ob1){
		ob = ob1;
	}
	Object getOb(){
		return ob;
	}
	void showType(){
		System.out.println("class of ob = " + ob.getClass().getName());
	}
}
class NonGenDemo{
	public static void main(String args[]){
		// AutoBoxing
		NonGen iOb = new NonGen(10);
		iOb.showType(); // java.lang.Object
		// Unboxing
		int i = (Integer)iOb.getOb();
		System.out.println(i);

		NonGen sOb = new NonGen("abc");
		sOb.showType();
		String st = (String)sOb.getOb();
		System.out.println(st);

		iOb = sOb; // type safety demo.. doesnt shows error

		int i2 = (Integer)iOb.getOb();
		
	}
}

/* Compilation and result:
 Without Type casting:
[y13cse79@localhost 100315]$ javac NonGenDemo.java
NonGenDemo.java:26: error: incompatible types
                int i = iOb.getOb();
                                 ^
  required: int
  found:    Object
NonGenDemo.java:31: error: incompatible types
                String st = sOb.getOb();
                                     ^
  required: String
  found:    Object
2 errors

Error due to no Type Safety After Type Casting:
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot
 be cast to java.lang.Integer
        at NonGenDemo.main(NonGenDemo.java:36)
ABRT problem creation: 'success'

After TypeCasting and Commenting error:

[y13cse79@localhost 100315]$ javac NonGenDemo.java
[y13cse79@localhost 100315]$ java NonGenDemo
class of ob = java.lang.Integer
10
class of ob = java.lang.String
abc
 */

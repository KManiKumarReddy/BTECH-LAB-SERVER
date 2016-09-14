/**
 * <h1> Wrapper Classes Boxing and Unbvoxing </h1>
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 100315
 */

class WrapperDemo{
	public static void main(String args[]){
		// Boxing
		Integer io1 = new Integer(10);
		//Autoboxing
		Integer io2 = 10;
		//Unboxing
		int i1 = io1.intValue();
		//Auto unboxing
		int i2 = io1;
		int i3 = Integer.parseInt("50");
		Integer io3 = Integer.valueOf("100");
		System.out.println(io3);
		System.out.println(i3);
	}
}

/* Compilation and result:
[y13cse79@localhost 100315]$ javac WrapperDemo.java
[y13cse79@localhost 100315]$ java WrapperDemo
100
50
*/

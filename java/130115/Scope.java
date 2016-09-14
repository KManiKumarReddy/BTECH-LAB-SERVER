/**
 * <h1>Scope</h1>
 * To demonstrate scope of a variable in java
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13-Jan-2015
 */

class Scope{
	public static void main(String args[]){
		int x=10; // method scope
		System.out.println("x=" +x);
		if(x>1){
			int y = 20; // block scope
			System.out.println("x+y=" + (x+y) ); //Scope of variable in outer block
								//is present in inner block
		}
		// Scope of y ends in outer block so you need to declare again
		int y  = 25;
		System.out.println("x+y=" + (x+y) ); //Scope of variable in outer block
	}
}

/* Compilation and result
 * [y13cse79@localhost 130115]$ javac Scope.java
 * [y13cse79@localhost 130115]$ java Scope
 * x=10
 * x+y=30
 * x+y=35
 */

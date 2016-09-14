/**
 * <h1>Operators</h1>
 * This program demonstrates new operator functions in java
 * 
 * @author Mani Kumar Reddy Kancharla 13B81A0579
 *
 * @since 20-Jan-2015
 **/

class OperatorTest{
	// Main function
	public static void main(String args[]){
		double m = 12.5%7; // modulus on real values
		System.out.println(m); 
		int a = 5;
		int b = a++ + ++a;
		System.out.println("a= " + a + " b= " + b);
		int c, d;
		int e = (c = ++b) + (d = b++);
		System.out.println("c= " + c + " d= " + d + " e = " + e);
		int x, y, z;
		x = y = z = 3; // chain of assignment
		System.out.println("x= " + x + " y= " + y + " z = " + z);
		System.out.println(x=5);
		boolean bo = true;
		bo &= false; // shorthand &
		System.out.println(bo);
		bo ^= true; // s.h. XOR
		System.out.println(bo);

		// short circuit operators
		int test = 0;
		if(true || (++test) == 1)
			System.out.println(test);
		if(true | (++test) == 1)
			System.out.println(test);
		if(!(false && (++test) == 2))
			System.out.println(test);
		if(!(false & (++test) == 2))
			System.out.println(test);

	}
}

/*Compilation and Result:
 * [y13cse79@localhost 200115]$ javac OperatorTest.java
 * [y13cse79@localhost 200115]$ java OperatorTest
 * 5.5
 * a= 7 b= 12
 * c= 13 d= 13 e = 26
 * x= 3 y= 3 z = 3
 * 5
 * false
 * true
 * 0
 * 1
 * 1
 * 2
*/

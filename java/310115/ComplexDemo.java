/**
 * <h1>Complex numbers</h1>
 * Program to demonstrate passing objects using call by reference
 * and returning objects
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 31-Jan-2015
 */

import java.util.Scanner;

class Complex{
	double r, i;
	Complex(double x, double y){
		r = x;
		i = y;
	}
	// function to add with calling object
	Complex add(Complex a){
		Complex sum = new Complex(0, 0);
		sum.r = r + a.r;
		sum.i = i + a.i;
		return sum;
	}
	// function to substract from calling object
	Complex substract(Complex a){
		Complex sum = new Complex(0, 0);
		sum.r = r - a.r;
		sum.i = i - a.i;
		return sum;
	}

	// function to display value
	void disp(){
		System.out.println("Number : " + r + " + " + i + "i");
	}
}

class ComplexDemo{
	public static void main(String args[]){

		// reading input from user
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("Enter real and imaginary parts of c1:");
		i = sc.nextInt();
		j = sc.nextInt();
		Complex c1 = new Complex(i, j);
		System.out.println("Enter real and imaginary parts of c2:");
		i = sc.nextInt();
		j = sc.nextInt();
		Complex c2 = new Complex(i, j);
		
		// Printing sum and difference
		System.out.println("sum = ");
		(c1.add(c2)).disp();
		System.out.println("diff = ");
		(c1.substract(c2)).disp();
		return;
	}
}

/* Compilation and Result:
[y13cse79@localhost 310115]$ javac ComplexDemo.java
[y13cse79@localhost 310115]$ java ComplexDemo
Enter real and imaginary parts of c1:
1 2
Enter real and imaginary parts of c2:
2 3
sum =
Number : 3.0 + 5.0i
diff =
Number : -1.0 + -1.0i
*/

/**
 @Author:Mani Kumar Reddy Kancharla 13B81A0579
 
 @Date: 06 Jan 2015
 
 @Description: Program to scan two numbers and print maximum of two numbers
 
 **/

import java.util.*;

class ScanIntPrintMax{
	// Main function
	public static void main(String args[]){
		// Initializing Scanner Object
		Scanner inputBuffer = new Scanner(System.in);

		// local declarations
		int a, b, m;
		
		//Reading integers
		System.out.println("Enter two Integers: ");
		a = inputBuffer.nextInt();
		b = inputBuffer.nextInt();

		//checking maximum
		m = a>b?a:b;

		// Print statement
		System.out.println("Maximum = " + m);
	}
}

/*Compilation and Result:
"ScanIntPrintMax.java" 35L, 645C written
[y13cse79@localhost 06-01-15]$ javac ScanIntPrintMax.java
[y13cse79@localhost 06-01-15]$ java ScanIntPrintMax
Enter two Integers:
2 3
Maximum = 3
*/

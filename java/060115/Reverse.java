/**
 @Author:Mani Kumar Reddy Kancharla 13B81A0579
 
 @Date: 06 Jan 2015
 
 @Description: Prints reverse of input integer
 
 **/

import java.util.*;

class Reverse{
	// Main function
	public static void main(String args[]){
		
		// Initializing scanner object
		Scanner inputBuffer = new Scanner(System.in);

		// local declarations
		int n, result = 0;
		
		//Reading integer
		System.out.println("Enter an integer: ");
		n = inputBuffer.nextInt();
		
		// taking out last digit from n and adding it to front of result
		while(n > 0){
			result = result * 10 + n % 10;
			n /= 10;	
		}

		// Printing result
		System.out.println("Result : " + result);
	}
}

/*Compilation and Result:
"Reverse.java" 38L, 690C written
[y13cse79@localhost 06-01-15]$ javac Reverse.java
[y13cse79@localhost 06-01-15]$ java Reverse
Enter an integer:
123456
Result : 654321
*/

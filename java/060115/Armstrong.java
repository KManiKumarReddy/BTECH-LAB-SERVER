/**
 @Author:Mani Kumar Reddy Kancharla 13B81A0579
 
 @Date: 06 Jan 2015
 
 @Description: Checks whether given number is Armstrong or not
 
 **/

import java.util.*;

class Armstrong{
	// Main function
	public static void main(String args[]){
		
		// Initializing scanner object
		Scanner inputBuffer = new Scanner(System.in);

		// local declarations
		int n, result = 0, digit;
		
		//Reading integer
		System.out.println("Enter an integer: ");
		n = inputBuffer.nextInt();
		
		// Taking a duplicate of n
		int n1 = n;

		// taking out last digit from n and adding it to front of result
		while(n1 > 0){
			digit = n1%10;
			result += digit*digit*digit;
			n1 /= 10;	
		}

		// Printing result
		if(n == result)
			System.out.println(result + " is an armstrong number");
		else
			System.out.println(n + " is not an armstrong number");	
	}
}

/*Compilation and Result:
 * "Armstrong.java" 45L, 875C written
 * [y13cse79@localhost 06-01-15]$ javac Armstrong.java
 * ^[[A^[[A[y13cse79@localhost 06-01-15]$
 * [y13cse79@localhost 06-01-15]$ java Armstrong
 * Enter an integer:
 * 153
 * 153 is an armstrong number
 * [y13cse79@localhost 06-01-15]$ java Armstrong
 * Enter an integer:
 * 222
 * 222 is not an armstrong number
*/

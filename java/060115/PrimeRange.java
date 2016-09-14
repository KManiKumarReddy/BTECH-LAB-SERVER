/**
 @Author:Mani Kumar Reddy Kancharla 13B81A0579
 
 @Date: 06 Jan 2015
 
 @Description: To print Prime numbers in range 2 - n
 
 **/

import java.util.*;

class PrimeRange{
	// Main function
	public static void main(String args[]){
		
		// Initializing scanner object
		Scanner inputBuffer = new Scanner(System.in);

		// local declarations
		int n, count;
		
		//Reading integer
		System.out.println("Enter n in range 2-n: ");
		n = inputBuffer.nextInt();
		
		// Loop from 1 - n
		for(int i = 2; i <= n; i++){
			count = 0;
			// checking each number to count multiples
			for(int j = 2; j <= i/2; j++)
				if(i % j == 0){
					count ++;
					break;
				}
			// printing if there are no multiples
			if( count == 0)
				System.out.println(i);
		}
	}
}

/*Compilation and Result:
"PrimeRange.java" 41L, 765C written
[y13cse79@localhost 06-01-15]$ javac PrimeRange.java
^[[A[y13cse79@localhost 06-01-15]$ java PrimeRange
Enter n in range 2-n:
100
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
 */

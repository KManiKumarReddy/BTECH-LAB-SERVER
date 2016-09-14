/**
 * <h1>Calculate Frequency </h1>
 * This progranm is used to demonstrate arrays
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13 Jan 2015
 */

import java.util.*;
class Frequency{
	public static void main(String args[]){
		// local declarations
		int a[] ,f= 0, in, n;

		// reading size of array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of values:");
		n = input.nextInt();
		a = new int[n];
		// Reading input
		System.out.println("Enter "+ n +" values:");
		for(int i = 0; i < n; i++)
			a[i] = input.nextInt();
	
		System.out.println("Enter number whose frequency is to be found :");
		in = input.nextInt();
		for(int i = 0; i < n; i++)
			if(a[i] == in)
				f++;
		System.out.println("Frequency: "+ f);
	}
}

/* Compilation and result:
[y13cse79@localhost 13-01-15]$ javac Frequency.java
[y13cse79@localhost 13-01-15]$ java Frequency
Enter number of values:
10
Enter 10 values:
1
1
1
2
5
2
1
5
2
9
Enter number whose frequency is to be found :
2
Frequency: 3
*/

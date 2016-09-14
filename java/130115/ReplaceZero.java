/**
 * <h1>Replace Zeros</h1>
 * This progranm reads an array of integers and prints
 * output by replacing zeros with successive number
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13 Jan 2015
 */

import java.util.*;
class ReplaceZero{
	public static void main(String args[]){
		// local declarations
		int a[], n;

		// reading size of array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of values:");
		n = input.nextInt();
		a = new int[n];
		// Reading input
		System.out.println("Enter "+ n +" values:");
		for(int i = 0; i < n; i++)
			a[i] = input.nextInt();

		// Printing result
		System.out.println("Result:");
		for(int i = 0; i < n; i++)
			if(a[i] == 0)
				System.out.println(replaceZero(a, i));
			else
				System.out.println(a[i]);
	}

	static int replaceZero(int a[], int i){
		if(i == a.length - 1)
			if(a[0] != 0)
				return a[0];
			else
				return replaceZero(a, 0);
		if(a[i + 1] == 0)
			return replaceZero(a, i+1);
		return a[i+1];
	}
}

/* Compilation and result:
[y13cse79@localhost 13-01-15]$ javac ReplaceZero.java
[y13cse79@localhost 13-01-15]$ java ReplaceZero
Enter number of values:
10
Enter 10 values:
0
0
1
2
5
1
0
2
9
0
Result:
1
1
1
2
5
1
2
2
9
1
*/

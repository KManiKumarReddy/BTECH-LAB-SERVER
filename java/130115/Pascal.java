/**
 * <h1>n Lines Pascal Triangle</h1>
 * This program demonstrates ragged arrays concept
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13 Jan 2015
 */
import java.util.*;
class Pascal{
	public static void main(String args[]){
		// local declarations
		int a[][], n;

		// reading input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of lines:");
		n = input.nextInt();
		// allocation memory for array
		a = new int[n][];
		for(int i = 0; i < n; i++)
			a[i] = new int[i+1];
		// initializing triangle
		for(int i = 0; i < n; i++)
			for(int j = 0; j <= i; j ++)
				if(i == j || j == 0)
					a[i][j] = 1;
				else
					a[i][j] = a[i-1][j-1] + a[i-1][j];

		// Printing result
		System.out.println("Pascal Triangle:");
		for(int i = 0; i < n; i++){
			System.out.println();
			for(int j = 0; j <= i; j++)
				System.out.print("\t" + a[i][j]);
		}
	}
}

/* Compilation and result:
[y13cse79@localhost 13-01-15]$ javac Pascal.java
[y13cse79@localhost 13-01-15]$ java Pascal
Enter no. of lines:
6
Pascal Triangle:

        1
        1       1
        1       2       1
        1       3       3       1
        1       4       6       4       1
        1       5       10      10      5       1

*/

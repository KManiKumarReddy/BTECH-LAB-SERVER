/**
 * <h1>Read Matrix</h1>
 * This program reads a 3x3 matrix and print the same
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13 Jan 2015
 */

import java.util.*;
class Matrix{
	public static void main(String args[]){
		// local declarations
		int a[][] = new int[3][3];

		// reading input
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.println("Enter  row"+ (i+1) +"'s 3 values:");
			for(int j = 0; j < 3; j++)
				a[i][j] = input.nextInt();
		}
	
		System.out.println("Matrix:");
		for(int i = 0; i < 3; i++){
			System.out.println();
			for(int j = 0; j < 3; j++)
				System.out.print("\t" + a[i][j]);
		}
	}
}

/* Compilation and result:
[y13cse79@localhost 13-01-15]$ javac Matrix.java
[y13cse79@localhost 13-01-15]$ java Matrix
Enter  row1's 3 values:
1 2 3
Enter  row2's 3 values:
4 5 6
Enter  row3's 3 values:
7 8 9
Matrix:

        1       2       3
        4       5       6
        7       8       9
*/

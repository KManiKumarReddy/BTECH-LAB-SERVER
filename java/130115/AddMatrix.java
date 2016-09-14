/**
 * <h1>Add Matrices</h1>
 * This program reads two 3x3 matrices and print their sum
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13 Jan 2015
 */

import java.util.*;
class AddMatrix{
	public static void main(String args[]){
		// local declarations
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];

		// reading input
		System.out.println("Enter matrix A:");
		a = readMatrix();
		System.out.println("Enter matrix B:");
		b = readMatrix();
		// printing result
		System.out.println("Matrix A+B:");
		for(int i = 0; i < 3; i++){
			System.out.println();
			for(int j = 0; j < 3; j++)
				System.out.print("\t" + (a[i][j] + b[i][j]));
		}
	}
	static int[][] readMatrix(){
		int a[][] = new int[3][3];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.println("Enter  row"+ (i+1) +"'s 3 values:");
			for(int j = 0; j < 3; j++)
				a[i][j] = input.nextInt();
		}
		return a;
	}
}
/* Compilation and result:
[y13cse79@localhost 13-01-15]$ javac AddMatrix.java
[y13cse79@localhost 13-01-15]$ java AddMatrix
Enter matrix A:
Enter  row1's 3 values:
1 2 3
Enter  row2's 3 values:
4 5 6
Enter  row3's 3 values:
7 8 9
Enter matrix B:
Enter  row1's 3 values:
3 2 1
Enter  row2's 3 values:
6 5 4
Enter  row3's 3 values:
9 8 7
Matrix A+B:

        4       4       4
        10      10      10
        16      16      16 
 */

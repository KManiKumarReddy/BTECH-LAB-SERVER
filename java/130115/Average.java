/**
 * <h1>Calculate Average </h1>
 * This progranm is used to demonstrate arrays
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 13 Jan 2015
 */

import java.util.*;
class Average{
	public static void main(String args[]){
		// local declarations
		int a[], sum = 0, n;
		double avg;

		// reading size of array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of values:");
		n = input.nextInt();
		a = new int[n];
		// Reading input and computing average
		System.out.println("Enter "+ n +" values:");
		for(int i = 0; i < n; i++){
			a[i] = input.nextInt();
			sum += a[i];
		}
		avg = (double)sum/n;
		System.out.println("Average =" + avg);
	}
}

/* Compilation and result:
[y13cse79@localhost 13-01-15]$ javac Average.java
[y13cse79@localhost 13-01-15]$ java Average
Enter number of values:
5
Enter 5 values:
1
2
3
4
5
Average =3.0
*/

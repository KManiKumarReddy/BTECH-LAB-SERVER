/**
 * <h1>Two dimensional array For Each</h1>
 * This program demonstrates use of for each loop in two dimensional arrays
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 27-Jan-2015
 */

class ForEach3{
	public static void main(String args[]){
		int a[][] = {{1, 2, 3},{7, 8, 9}}, sum = 0;
		for(int i[]:a)
			for(int j:i)
				sum +=j;
		System.out.println("sum = " + sum);
	}
}

/*Compilation and output:
[y13cse79@localhost 270115]$ javac ForEach3.java
[y13cse79@localhost 270115]$ java ForEach3
sum = 30
*/


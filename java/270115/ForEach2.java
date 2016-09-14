/**
 * <h1>For Each Read-only</h1>
 * This program demonstrates readonly property of iterator in for each loop
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 27-Jan-2015
 */

class ForEach2{
	public static void main(String args[]){
		int a[] = {1, 5, 7, 9, 6}, sum = 0;
		for(int i:a){
			sum +=i;
			i *= 2;
		}
		System.out.println("sum =" + sum);
		for(int i:a)
			System.out.println(" " + i);	
	}
}

/*Compilation and output:
 [y13cse79@localhost 270115]$ javac ForEach2.java
[y13cse79@localhost 270115]$ java ForEach2
sum =28
 1
 5
 7
 9
 6
*/


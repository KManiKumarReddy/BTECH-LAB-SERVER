/**
 * <h1>For each loop</h1>
 * Porgram to demonstrate syntax of for each loop
 *
 * @author Mani Kumar Reddy K 13B81a0579
 * @since 27-Jan-2015
 * */

class ForEach1{
	public static void main(String args[]){
		int a[] = {1, 3, 5, 7, 9}, sum = 0;
		for(int i:a)
			sum += i;
		System.out.println("sum= " + sum);
	}
}

/* Compilation and result:
[y13cse79@localhost 270115]$ javac ForEach1.java
[y13cse79@localhost 270115]$ java ForEach1
sum= 25
*/

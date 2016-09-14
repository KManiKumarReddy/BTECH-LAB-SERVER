/**
 * <h1>String to int</h1>
 *
 * @author Mani kumar reddy k 13b81A0579
 * @since 10-02-2015
 */

class CLAAvg{
	public static void main(String args[]){
		int sum = 0;
		for(int i = 0; i < args.length; i++)
			sum += Integer.parseInt(args[i]);
		System.out.println("Average = " + (double)sum/args.length);
	}
}

/* Compilation and Result:
[y13cse79@localhost 100215]$ javac CLAAvg.java
[y13cse79@localhost 100215]$ java CLAAvg 50 51 52 53 54
Average = 52.0
[y13cse79@localhost 100215]$
*/ 

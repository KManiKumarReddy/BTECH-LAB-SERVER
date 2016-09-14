/**
 * <h1> Static Block Demo</h1>
 * @author mani kumar Reddy K 13B81A0579
 * @since 03-02-2015
 */


import java.util.*;

class StaticBlock{
	static int i = 10;
	static int j, k;
	static{
		j=i+10;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a value");

		k=sc.nextInt();
	}

	public static void main(String args[]){
		System.out.println("in main,"+"j="+j+","+"k="+k);
	}
}


/* OUTPUT:
[y13cse79@localhost 030215]$ javac StaticBlock.java
[y13cse79@localhost 030215]$ java StaticBlock
Enter a value
10
in main,j=20,k=10
 */ 

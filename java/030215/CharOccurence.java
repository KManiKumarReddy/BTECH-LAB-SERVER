/**
 * <h1>Char Occurences</h1>
 * Counts number of occurences of a character in a string
 * @author Mani Kumar reddy k 13b81a0579
 * @since 03-02-2015
 */

import java.util.Scanner;

class CharOccurence{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String in = sc.nextLine();
		System.out.println("Enter character whose occurence is to be counted:");
		char key = sc.next().charAt(0);
		int count = 0;
		for(int i = 0; i < in.length(); i++)
			if(in.charAt(i) == key)
				count++;
		System.out.println("Occurences = " + count);
	}
}

/* Compilation and Result:
[y13cse79@localhost 030215]$ javac CharOccurence.java
[y13cse79@localhost 030215]$ java CharOccurence
Enter String:
Mani is a very good boy :P
Enter character whose occurence is to be counted:
o
Occurences = 3
*/ 

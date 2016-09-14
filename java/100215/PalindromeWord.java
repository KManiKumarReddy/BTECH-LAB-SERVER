/**
 * <h1>Palindrome Word</h1>
 *
 * @author Mani kumar reddy k 13b81A0579
 * @since 10-02-2015
 */

import java.util.Scanner;
import java.lang.String;

class PalindromeWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String in = sc.next();
		StringBuffer strBuff = new StringBuffer(in);
		strBuff.reverse();
		if(in.contentEquals(strBuff))
			System.out.println("is a Palindrome String");
		else
			System.out.println("is not a Palindrome String");
			
	}
}

/* Compilation and Result:
[y13cse79@localhost 030215]$ javac PalindromeString.java
[y13cse79@localhost 030215]$ java PalindromeString
Enter a word:
Mani
is not a Palindrome String
[y13cse79@localhost 030215]$ java PalindromeString
Enter a word:
eie
is a Palindrome String
*/ 

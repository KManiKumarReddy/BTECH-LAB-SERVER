/**
 * <h1>Palindrome String</h1>
 * To check whether given string is palindrome or not
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 03-02-2015
 */

import java.util.Scanner;
import java.lang.String;

class PalindromeString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String in = sc.nextLine();
		StringBuffer input = new StringBuffer(in);
		String rev = new String(input.reverse());
		if(in.equals(rev))
			System.out.println("is a Palindrome String");
		else
			System.out.println("is not a Palindrome String");
			
	}
}

/* Compilation and Result:
[y13cse79@localhost 030215]$ javac PalindromeString.java
[y13cse79@localhost 030215]$ java PalindromeString
Enter String:
Mani
is not a Palindrome String
[y13cse79@localhost 030215]$ java PalindromeString
Enter String:
eie
is a Palindrome String
*/ 

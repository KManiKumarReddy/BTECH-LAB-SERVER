/**
 * <h1>College Name Manipulation</h1>
 *
 * @author Mani kumar reddy k 13b81A0579
 * @since 10-02-2015
 */

import java.util.Scanner;

class InsertCollege{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter College Name");
		StringBuffer clgName = new StringBuffer(sc.nextLine());
		clgName.insert(clgName.indexOf("College"), "Engineering ");
		System.out.println(clgName);
	}
}

/* Compilation and Result:
[y13cse79@localhost 100215]$ javac InsertCollege.java
[y13cse79@localhost 100215]$ java InsertCollege
Enter College Name
CVR College
CVR Engineering College
*/

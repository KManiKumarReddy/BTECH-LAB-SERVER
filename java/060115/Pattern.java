/**
 @Author:Mani Kumar Reddy Kancharla 13B81A0579
 
 @Date: 06 Jan 2015
 
 @Description: Prints following pattern:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 
 
 **/

import java.util.*;

class Pattern{
	// Main function
	public static void main(String args[]){
		
		// for loop for lines
		for(int i = 1; i <= 5; i++){
			// for loop for each line	
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}

/*Compilation and Result:
"Pattern.java" 32L, 465C written
[y13cse79@localhost 06-01-15]$ javac Pattern.java
^[[A[y13cse79@localhost 06-01-15]$ java Pattern
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

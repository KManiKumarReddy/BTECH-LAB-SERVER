/**
 @Author:Mani Kumar Reddy Kancharla 13B81A0579
 
 @Date: 06 Jan 2015
 
 @Description: Java Program to use Command Line Arguments
 
 **/

class CommandLineArgs{
	// Main function
	public static void main(String args[]){
		// validation
		if(args.length != 2){
			System.out.println("Error: Try again");
			return;
		}
		// Print statement
		System.out.println("Argument 1 =" + args[0]);
		System.out.println("Argument 2 =" + args[1]);
	}
}

/*Compilation and Result:
"CommandLineArgs.java" 25L, 473C written
[y13cse79@localhost 06-01-15]$ javac CommandLineArgs.java
[y13cse79@localhost 06-01-15]$ java CommandLineArgs
Error: Try again
[y13cse79@localhost 06-01-15]$ java CommandLineArgs Mani CSE
Argument 1 =Mani
Argument 2 =CSE
*/

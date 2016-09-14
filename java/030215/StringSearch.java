import java.util.Scanner;
import java.lang.String;

class StringSearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list:");
		int n = sc.nextInt();
		String list[] = new String[n];
		System.out.println("Enter Strings:");
		
		for(int i = 0; i < n; i++)
			list[i] = sc.next();
		System.out.println("Enter string to be searched:");
		String key = sc.next();
		
		for(int i = 0; i < n; i++)
			if(list[i].equals(key)){
				System.out.println("String found at index: " + i);
				return;
			}
		System.out.println("String not found");	
	}
}

/* Compilation and Result:
*/ 

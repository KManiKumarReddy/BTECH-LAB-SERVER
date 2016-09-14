import java.util.Scanner;
import java.lang.String;

class StringSort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list:");
		int n = sc.nextInt();
		String list[] = new String[n];
		System.out.println("Enter Strings:");
		for(int i = 0; i < n; i++)
			list[i] = sc.next();

		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				if(list[i].compareTo(list[j]) > 0){
					String temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
		
		
		for(int i = 0; i < n; i++)
			System.out.println(list[i]);
	}
}

/* Compilation and Result:
[y13cse79@localhost 030215]$ javac StringSort.java
[y13cse79@localhost 030215]$ java StringSort
Enter size of list:
5
Enter Strings:
Mani Arjun Reddy Preetham CVR
Arjun
CVR
Mani
Preetham
Reddy
*/ 

/**
 * <h1>== and equals() on string objects</h1>
 *
 * @author Mani kumar reddy k 13b81A0579
 * @since 10-02-2015
 */

class EqualsDemo{
	public static void main(String args[]){
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = str1;
		System.out.println("str1 equals str2 is: " + str1.equals(str2));
		System.out.println("str1 == str2 is: " + (str1 == str2));
		System.out.println("str1 == str3 is: " + (str1 == str3));
		System.out.println("str1 equals str3 is: " + str1.equals(str3));
	}
}

/* Compilation and Result:
[y13cse79@localhost 100215]$ javac EqualsDemo.java
[y13cse79@localhost 100215]$ java EqualsDemo
str1 equals str2 is: true
str1 == str2 is: false
str1 == str3 is: true
str1 equals str3 is: true
*/ 

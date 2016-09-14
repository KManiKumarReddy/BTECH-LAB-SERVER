

class Stringdemo{
public static void main(String args[])
{
String str1="abc";
String str2=new String("xyz");
String str3=str1;
String str4="xyz"+"abc"+"123";

System.out.println("str1="+str1);
System.out.println("str2="+str2);
System.out.println("length of str3="+str3.length());
System.out.println("str1=str3 is="+str1.equals(str3));
System.out.println("uppercase of str1="+str1.toUpperCase());
System.out.println("concatenating"+str1.concat(str2));
System.out.println("comparing str1 and str2"+str1.compareTo(str2));
}
}


/* OUTPUT:
 *
localhost 030215]$ javac Stringdemo.java
[y13cse76@localhost 030215]$ java Stringdemo
str1=abc
str2=xyz
length of str3=3
str1=str3 is=true
uppercase of str1=ABC
concatenatingabcxyz
comparing str1 and str2-23
*/

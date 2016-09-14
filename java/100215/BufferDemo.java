/**
 * <h1>String Buffer Demo</h1>
 *
 * @author Mani kumar reddy k 13b81A0579
 * @since 10-02-2015
 */

import java.lang.String;

class BufferDemo{
	public static void main(String args[]){
		String str = "xyz";
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer("abc");
		StringBuffer s3 = new StringBuffer(str);
		System.out.println(s2.length());
		System.out.println(s2.append(10));
		System.out.println(s2.append('b'));
		System.out.println(s2.append(true));
		System.out.println(s2.append(10.6));
		System.out.println(s2.insert(2, "mr"));
		System.out.println(s2.replace(2, 4, "qe"));
		s2.reverse();
		s2.deleteCharAt(0);
		s2.delete(2, 4);
		System.out.println(s2);
	}
}

/* Compilation and Result:
[y13cse79@localhost 100215]$ javac BufferDemo.java
[y13cse79@localhost 100215]$ java BufferDemo
3
abc10
abc10b
abc10btrue
abc10btrue10.6
abmrc10btrue10.6
abqec10btrue10.6
.0urtb01ceqba
*/

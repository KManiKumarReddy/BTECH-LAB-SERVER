package p2.myPack2;
import p1.myPack1.W;
public class M extends W{
	public void display(){
		System.out.println( a + b + c + d);
	}
}
/* Compilation errors:
-[y13cse79@localhost myPackage]$ javac -d . M.java N.
M.java:4: error: cannot find symbol
                System.out.println( a + b + c + d);
                                    ^
  symbol:   variable a
  location: class M
M.java:4: error: cannot find symbol
                System.out.println( a + b + c + d);
                                        ^
  symbol:   variable b
  location: class M
M.java:4: error: cannot find symbol
                System.out.println( a + b + c + d);
                                            ^
  symbol:   variable c
  location: class M
M.java:4: error: cannot find symbol
                System.out.println( a + b + c + d);
                                                ^
  symbol:   variable d
  location: class M

*/

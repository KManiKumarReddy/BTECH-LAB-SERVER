
package p2.myPack2;

import p1.myPack1.W;

public class N{
	public void display(){
		W o = new W();
		System.out.println(o.a + o.b + o.c + o.d);
	}
}
/*
[y13cse79@localhost myPackage]$ javac -d . M.java N.
N.java:4: error: cannot find symbol
                W o = new W();
                ^
  symbol:   class W
  location: class N
N.java:4: error: cannot find symbol
                W o = new W();
                          ^
  symbol:   class W
  location: class N
6 errors

*/

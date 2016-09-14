/**
 * <h1>Static demo<h1>
 * Demonstrating static members in java
 *
 * @author Mani Kumar reddy K 13B81A0579
 * @sicne 03-02-2015
 */




class MyStatic{
	int id;
	static int count=0;
	MyStatic(){
		count++;
		id=count;
	}
}

class StaticDemo{
	public static void main(String args[]){
		MyStatic s1[]=new MyStatic[10];
		for(int i=0;i<10;i++)
			s1[i]=new MyStatic();


System.out.println("ids of objects are");
for(int i=0;i<10;i++)
System.out.println(s1[i].id);
System.out.println("number of objects="+MyStatic.count);

}
}


/* OUTPUT:
 *
 * [y13cse79@localhost 030215]$ javac Staticdemo.java
 * [y13cse79@localhost 030215]$ java Staticdemo
 * ids of objects are
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * number of objects=10
 */ 


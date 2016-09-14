/**
 * <h1>Access Demo</h1>
 * @author mani kumar Reddy K 13B81A0579
 * @since 03-02-2015
 */

class Access{
	private int a;
	public int c;
	protected int b;
	int d;
	Access()
	{
		a=10;b=20;c=30;d=40;
	}
	void display(){
	System.out.println("a= " +a+ " b= " +b+ " c= " +c+ " d= " +d );
	}
}

class AccessDemo{
	public static void main(String args[]){
		Access o = new Access();
		o.b = 30;
		o.c = 40;
		o.d = 50;
		o.display();
	}
}


/* OUTPUT:
[y13cse79@localhost 030215]$ javac AccessDemo.java
[y13cse79@localhost 030215]$ java AccessDemo
a= 10 b= 30 c= 40 d= 50
 */

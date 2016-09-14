/**
 *<h1>Rectangle Demo</h1>
 * Program to demonstrate clases and objects concept
 *
 * @author Mani Kumar Reddy k 13b81a0579
 * @since 27-Jan-2015
 */

// creating a user defined type rectangle
class Rectangle{
	// isntance variables
	int l, b;
	Rectangle(int x, int y){
		l = x;
		b = y;
	}
	// method to display area
	void area(){
		System.out.println("Area = " + (l*b));
	}
	// method to display perimeter
	void perimeter(){
		System.out.println("Perimeter = " + (2*(l+b)));
	}
}

// main function class
class RectangleDemo{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(5, 6);
		r1.area();
		r1.perimeter();
		Rectangle r2 = new Rectangle(10, 20);
		r2.area();
		r2.perimeter();
	}
}

/* Compilation and output:
[y13cse79@localhost 270115]$ javac RectangleDemo.java
[y13cse79@localhost 270115]$ java RectangleDemo
Area = 30
Perimeter = 22
Area = 200
Perimeter = 60
*/

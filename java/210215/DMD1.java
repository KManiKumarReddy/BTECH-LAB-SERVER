/**
 * <h1> Two Dimensional Figure </h1>
 * Demonstrating Dynamic Method Dispatch using 2DF
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 210215
 */
import java.lang.Math;
class D2F{
	double d1, d2;
	double area(){
		return 0;
	}
	double perimeter(){
		return 0;
	}
	D2F(double i, double j){
		d1 = i; d2 = j;
	}
}
class Rectangle extends D2F{
	Rectangle(int i, int j){
		super(i , j);
	}
	double area(){
		return d1 * d2;
	}
	double perimeter(){
		return 2 * (d1 + d2);
	}
}

class Triangle extends D2F{
	Triangle(int i, int j){
		super(i , j);
	}
	double area(){
		return 0.5 * d1 * d2;
	}
	double perimeter(){
		return d1 + (2 * Math.sqrt(d1*d1 + d2*d2));
	}
}

class DMD1{
	static void display(D2F o){
		System.out.println("Area = " + o.area());
		System.out.println("Perimeter = " + o.perimeter());
	}
	public static void main(String args[]){
		Rectangle r = new Rectangle(2 , 3);
		Triangle t = new Triangle(1, 2);
		display(r);
		display(t);
	}
}

/* Compilation and Result:
[y13cse79@localhost 210215]$ javac DMD1.java
[y13cse79@localhost 210215]$ java DMD1
Area = 6.0
Perimeter = 10.0
Area = 1.0
Perimeter = 5.47213595499958
*/

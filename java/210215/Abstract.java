/**
 * <h1> Abstract Demo </h1>
 * Demonstrating Abstract classes and methods
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 210215
 */
import java.lang.Math;
abstract class D2F{
	double d1, d2;
	abstract double area();
	abstract double perimeter();
}
class Rectangle extends D2F{
	Rectangle(int i, int j){
		d1 = i; d2 = j;
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
		d1 = i; d2 = j;
	}
	double area(){
		return 0.5 * d1 * d2;
	}
	double perimeter(){
		return d1 + (2 * Math.sqrt(d1*d1 + d2*d2));
	}
}

class Abstract{
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
[y13cse79@localhost 210215]$ javac Abstract.java
[y13cse79@localhost 210215]$ java Abstract
Area = 6.0
Perimeter = 10.0
Area = 1.0
Perimeter = 5.47213595499958
*/

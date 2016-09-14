/**
 * <h1>Coordinates distace<h1>
 * This program calculates distances between points in coordinate goementry
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 27-Jan-2015;
 **/

import java.lang.Math;

class Point{
	// instance variables
	int x, y;
	Point(int a ,int b){
		x = a;
		y = b;
	}
	// method to calculate distance from origin
	void distanceFromOrigin(){
		System.out.println("Distance from (0,0) = "+ (Math.sqrt(x*x + y*y)));
	}
	// method to display distance between two points
	void distanceFromPoint(Point a){
		System.out.println("Distance from ("+a.x+","+a.y+") = "+(Math.sqrt((x - a.x)*(x - a.x) + (y - a.y)*(y - a.y))));
	}
}

class PointDemo{
	public static void main(String args[]){
		Point a = new Point(1, 2);
		Point b = new Point(3, 4);
		a.distanceFromOrigin();
		b.distanceFromOrigin();
		a.distanceFromPoint(b);
	}
}

/*Compilation and result:
[y13cse79@localhost 270115]$ mv Point.java PointDemo.java
[y13cse79@localhost 270115]$ javac PointDemo.java
[y13cse79@localhost 270115]$ java PointDemo
Distance from (0,0) = 2.23606797749979
Distance from (0,0) = 5.0
Distance from (3,4) = 2.8284271247461903 
*/

/**
 * <h1> Introduction to Bounded Types </h1>
 *
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 100315
 */

class Gen<T extends Number>{
	T list[];
	Gen(T list[]){
		this.list = list;
	}
	double avg(){
		double sum = 0;
		for(T i : list){
			sum += i.doubleValue();
		}
		return sum/list.length;
	}
}

class BoundedTypesDemo{
	public static void main(String args[]){
		Integer i[] = {1, 2, 3, 4, 5};
		Gen<Integer> iob = new Gen<Integer>(i);
		System.out.println("Average = " + iob.avg());
		
		//String out of bounds
		//String s[] = {"a", "b", "c"};
		//Gen<String> sob = new Gen<String>(s);
		//System.out.println("Average = " + sob.avg());

		Float f[] = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
		Gen<Float> fob = new Gen<Float>(f);
		System.out.println("Average = " + fob.avg());

	}
}

/*
Compilation and Result:
 
Error when tried with string:
[y13cse79@localhost 100315]$ javac BoundedTypesDemo.java
BoundedTypesDemo.java:29: error: type argument String is not within bounds of t
pe-variable T
                Gen<String> sob = new Gen<String>(s);
                    ^
  where T is a type-variable:
    T extends Number declared in class Gen
BoundedTypesDemo.java:29: error: type argument String is not within bounds of t
pe-variable T
                Gen<String> sob = new Gen<String>(s);
                                          ^
  where T is a type-variable:
    T extends Number declared in class Gen
2 errors

After Commenting:

[y13cse79@localhost 100315]$ javac BoundedTypesDemo.java
[y13cse79@localhost 100315]$ java BoundedTypesDemo
Average = 3.0
Average = 3.300000023841858
*/

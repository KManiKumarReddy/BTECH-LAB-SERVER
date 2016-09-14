/**
 * <h1>Super class references storing subclass address</h1>
 * @author Mani Kumar Reddy K 13B81A0579
 * @since 10-02-2015
 */

class Box{
	int l, b, h;
	void set(int i, int j, int k){
		l = i;
		b = j;
		h = k;
	}
	int volume(){
		return l * b * h;
	}
}

class BoxWeight extends Box{
	int wt;
	void setWt(int i, int j, int k, int l){
		l = i;
		b = j;
		h = k;
		wt = l;
	}
	void disp(){
		System.out.println("Volume = " + volume());
		System.out.println("Weight = " + wt);
	}
}

class BoxDemo{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.set(5, 6, 7);
		System.out.println(b1.volume());
		BoxWeight b2 = new BoxWeight();
		b2.setWt(1, 2, 3, 4);
		System.out.println(b2.volume());
		b2.disp();
		b1 = b2;
		System.out.println(b1.volume());
	}
}
/*Compilation and Result:
*/

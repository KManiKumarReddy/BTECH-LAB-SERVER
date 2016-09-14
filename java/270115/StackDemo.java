/**
 *<h1>Stack Demo</h1>
 * Program to implement stack in java
 *
 * @author Mani Kumar Reddy k 13b81a0579
 * @since 27-Jan-2015
 */

// creating a user defined type rectangle
class Stack{
	// isntance variables
	int a[], top;
	Stack(int n){
		a = new int[n];
		top = -1;
	}

	// method to insert data
	void push(int x){
		if(top == a.length)
			System.out.println("Stack is full");
		else
			a[++top] = x;
	}
	// method to delete elements in stack
	void pop(){
		if(top == -1)
			System.out.println("Stack is empty");
		else
			System.out.println(a[top--]);
	}
	// method to display status of stack
	void disp(){
		System.out.println("Status of stack is\n");
		for(int i = 0; i <= top; i++)
			System.out.print(a[i] + "-");
		System.out.print("END\n");
	}
}

// main function class
class StackDemo{
	public static void main(String args[]){
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.disp();
		s.pop();
		s.pop();
		s.disp();
	}
}

/* Compilation and output:

*/

package ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	public void push(long i) {
		if (!isFull()) {
			top ++;
			stackArray[top] = i;
		}
		else {
			System.out.println("Stack is full!");
		}
	}
	
	public long pop() {
		if (!isEmpty()) {
			int oldTop = top;
			top --;
			return stackArray[oldTop];
		}
		else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}
	
	public long peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}

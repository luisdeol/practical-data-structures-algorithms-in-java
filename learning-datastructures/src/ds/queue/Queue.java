package ds.queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(long longData) {
		if (this.nItems == this.maxSize) {
			System.out.println("No slot available for " + longData);
		}
		else {
			this.rear ++;
			this.queueArray[rear] = longData;
			this.nItems ++;
		}
	}
	
	public void view() {
		System.out.print("[");
		for(int i = 0; i < this.queueArray.length; i++) {
			System.out.print(this.queueArray[i] + " ");
		}
		System.out.print("]");
	}
	
	public long remove() {
		long temp = this.queueArray[front];
		this.front ++;
		this.nItems --;
		if (this.front == this.maxSize) {
			this.front = 0;
		}
		return temp;
	}
	
	public long peekFront() {
		return this.queueArray[this.front];
	}
	
	public boolean isEmpty() {
		return this.nItems == 0;
	}
	
	public boolean isFull() {
		return this.nItems == this.maxSize;
	}
}

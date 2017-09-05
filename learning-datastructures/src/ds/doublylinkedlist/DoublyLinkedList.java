package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		else {
			first.previous = newNode;
		}
		
		newNode.next = first;
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			first = newNode;
		}
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		
		last = newNode;
	}
	
	public Node deleteFirst() {			
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		
		Node tempNode = first;
		first = first.next;
		return tempNode;
	}
	
	public Node deleteLast() {
		if (last.previous == null) {
			first = null;
		}else {
			last.previous.next = null;
		}
		Node tempNode = last;
		last = last.previous;
		return tempNode;
	}
}

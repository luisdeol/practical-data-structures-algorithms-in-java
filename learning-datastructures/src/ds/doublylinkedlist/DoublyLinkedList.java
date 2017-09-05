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
		Node tempNode = last;
		if (last.previous == null) {
			first = null;
		}else {
			last.previous.next = null;
		}
		last = last.previous;
		return tempNode;
	}
	
	public boolean insertAfter(int key, int data) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if (current == null)
				return false;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if (current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
			
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	public Node deleteKey(int key) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if (current == null)
				return null;
		}
		
		if (current == first) {
			first = current.next;
		}else {
			current.previous.next = current.next;
		}
		
		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
			
		return current;
	}
	
	public void displayForward() {
		System.out.println("List (first -> last): ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("List (last -> first): ");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
}

package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);	
		myList.insertFirst(40);
		myList.insertFirst(10);
		myList.insertLast(120);
		myList.insertLast(140);
		
		myList.displayForward();
		
		myList.deleteFirst();
		myList.deleteKey(50);
		
		myList.displayBackward();
		myList.displayForward();
		
		myList.insertAfter(100, 101);
		myList.insertAfter(40, 41);
		
		myList.displayForward();
	}

}

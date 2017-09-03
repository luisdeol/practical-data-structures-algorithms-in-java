package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);	
		myList.insertFirst(40);
		myList.insertFirst(10);
		myList.insertLast(120);
		
		myList.displayList();
	}

}

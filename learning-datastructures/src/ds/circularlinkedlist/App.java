package ds.circularlinkedlist;


public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);	
		myList.insertFirst(40);
		myList.insertFirst(10);
		myList.insertLast(120);
		
		myList.displayList();
		
		System.out.println("Deleting Node " + myList.deleteFirst());
		System.out.println("Deleting Node " + myList.deleteFirst());
		System.out.println("Deleting Node " + myList.deleteFirst());
		System.out.println("Deleting Node " + myList.deleteFirst());
		System.out.println("Deleting Node " + myList.deleteFirst());
		System.out.println("Deleting Node " + myList.deleteFirst());
	}

}

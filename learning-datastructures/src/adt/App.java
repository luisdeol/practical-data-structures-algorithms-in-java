package adt;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter("My Counter!");
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		
		System.out.println(myCounter.getCurrentValue());
		
		LinkedList myList = new LinkedList();
	}

}

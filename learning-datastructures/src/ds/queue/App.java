package ds.queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(3);
		queue.insert(10);
		queue.insert(15);
		queue.insert(20);
		queue.insert(25);
		queue.insert(30);
		queue.insert(35);
		queue.view();
	}

}

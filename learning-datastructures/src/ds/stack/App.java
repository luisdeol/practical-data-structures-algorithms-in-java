package ds.stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack theStack = new Stack(4);
		theStack.push(1);
		theStack.push(5);
		theStack.push(10);
		theStack.push(7);
		theStack.push(13);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
	}
}

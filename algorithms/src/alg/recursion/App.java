package alg.recursion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reduceByOne(5);
	}
	
	public static void reduceByOne(int n) {
		if (n >= 0) {
			reduceByOne(n-1);
		}
		System.out.println("Completed Call :" + n);
	}
	
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		return -1;
	}
}

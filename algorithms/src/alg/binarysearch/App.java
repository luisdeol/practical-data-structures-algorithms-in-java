package alg.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1,2,5,6,8,9}, 2));
	}
	
	public static int binarySearch(int[] array, int number) {
		int p = 0;
		int r = array.length - 1;
		int q;
		while (p <= r) {
			q = (p + r)/2;
			if (array[q] > number)
				r = q - 1;
			else if (array[q] < number)
				p = q + 1;
			else
				return q;
		}
		
		return -1;
	}
}

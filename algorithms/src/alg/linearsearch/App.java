package alg.linearsearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static int linearSearch(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number)
				return i;
		}
		return -1;
	}
}

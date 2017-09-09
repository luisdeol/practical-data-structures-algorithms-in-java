package alg.quicksort;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {10,7,1,3,5,8,9,6};
		QuickSort.Partition(inputArray, 0, 7);
		
		for(int i=0;i<inputArray.length;i++)
			System.out.println(inputArray[i]);
	}

}

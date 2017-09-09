package alg.quicksort;

public class QuickSort {
	public static void Partition(int[] inputArray, int p, int r) {
		int i = p-1;
		int j = p;
		int pivot = r;
		while(j<=r) {
			if (inputArray[j]<=inputArray[pivot]) {
				i++;
				int temp = inputArray[j];
				inputArray[j] = inputArray[i];
				inputArray[i]=temp;
				System.out.println(" J : " + j + " I: " + i);
			}
			j++;
		}	
	}
}

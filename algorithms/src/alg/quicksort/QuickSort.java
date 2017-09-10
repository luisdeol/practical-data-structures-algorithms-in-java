package alg.quicksort;

public class QuickSort {
	public static void QuickSort(int[] inputArray, int start, int end) {
		if (start<end) {
			int q=Partition(inputArray,start,end);
			QuickSort(inputArray,start,q-1);
			QuickSort(inputArray,q+1,end);
		}

	}
	
	public static int Partition(int[] inputArray, int start, int end) {
		int i = start-1;
		int pivot = inputArray[end];
		for (int j=start;j<=end-1;j++){
			if (inputArray[j]<=pivot) {
				i++;
				int temp = inputArray[j];
				inputArray[j] = inputArray[i];
				inputArray[i]=temp;
				System.out.println(" J : " + j + " I: " + i);
			}
		}
		
		int ival = inputArray[i+1];
		inputArray[end]=ival;
		inputArray[i+1]=pivot;
		return i+1;
	}
}

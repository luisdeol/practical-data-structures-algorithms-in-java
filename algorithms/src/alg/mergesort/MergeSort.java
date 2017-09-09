package alg.mergesort;

public class MergeSort {

	public static void sort(int inputArray[]) {
		sort(inputArray, 0, inputArray.length-1);
	}
	
	public static void sort(int inputArray[], int start, int end) {
		if (end <= start){
			return;
		}
		
		int mid = (start+end)/2;
		sort(inputArray, start, mid);
		sort(inputArray, mid+1, end);
		merge(inputArray,start,mid,end);
	}
	
	public static void merge(int inputArray[], int start, int mid, int end) {
		int tempArray[] = new int[end-start+1];
		int leftSlot = start;
		int rightSlot = mid+1;
		int k = 0;
		while(leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			}
			else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}

		if (leftSlot <= mid) {
			while(leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end){
			while(rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}
		for (int i1=0; i1<tempArray.length; i1++) {
			inputArray[start+i1] = tempArray[i1];
		}
	}
}

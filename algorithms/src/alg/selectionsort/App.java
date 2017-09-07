package alg.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {9,8,3,87,12,114,2,256});
		for (int i=0; i < myArray.length; i++)
			System.out.println(myArray[i]);
	}
	
	public static int[] selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < a.length; j ++)
				if (a[j] < a[minimum])
					minimum = j;
			int aux = a[i];
			a[i] = a[minimum];
			a[minimum] = aux;
		}
		return a;
	}
}

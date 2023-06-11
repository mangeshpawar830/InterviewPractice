package javaArrayProgram;

public class SortingAscendingOrder {
	public static void main(String[] args) {
		int arr[] = new int[] { 9, 6, 8, 5, 7, 4, 1, 3, 2 };
		int temp = 0;
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elemets after sorting in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

package javaArrayProgram;

public class EvenPosition {
	public static void main(String[] args) {
		System.out.print("Elements In Even Number: ");
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				System.out.print(arr[i] + " ");
			}
		}

	}

}

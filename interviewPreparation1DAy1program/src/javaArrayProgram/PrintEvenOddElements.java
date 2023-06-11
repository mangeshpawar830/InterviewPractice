package javaArrayProgram;

public class PrintEvenOddElements {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("Even Elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.print(" " + arr[i]);
			}
		}
		System.out.println();
		System.out.print("Odd Elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + arr[i]);
			}
		}
	}
}

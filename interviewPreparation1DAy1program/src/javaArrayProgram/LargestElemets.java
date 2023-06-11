package javaArrayProgram;

public class LargestElemets {
	public static void main(String[] args) {
		int arr[] = new int[] { 11, 55, 12, 56, 97, 13 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.print("Largest Elements In Arry: " + max);

	}

}

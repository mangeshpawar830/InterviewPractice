package javaArrayProgram;

public class OddPosition {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("Odd Position in Array: ");
		for (int i = 0; i < arr.length; i ++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

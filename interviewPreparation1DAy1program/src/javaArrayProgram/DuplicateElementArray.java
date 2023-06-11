package javaArrayProgram;

public class DuplicateElementArray {
	public static void main(String[] args) {
		int arr[]=new int[] {122,254,3,1,2,4,5,6,8,4,5};
		System.out.print("Duplicate Elements In Array: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}

}

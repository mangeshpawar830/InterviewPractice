package javaArrayProgram;


public class RotateArrayLeft{
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int j,n=3;
		for(int i=0;i<n;i++) {
			int first=arr[0];
			
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println();
		
		
		
		System.out.println("Array After Left Rotation: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

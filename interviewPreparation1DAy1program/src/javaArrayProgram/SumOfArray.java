package javaArrayProgram;

public class SumOfArray {
	public static void main(String[] args) {
		int arr[]=new int[] {1,22,3,55};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum Of The Elements In Array Is: "+sum);
	}

}

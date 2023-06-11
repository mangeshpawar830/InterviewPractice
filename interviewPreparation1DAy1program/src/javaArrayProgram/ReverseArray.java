package javaArrayProgram;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements In Array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Elements In Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("After Reverse Elements In Array: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	

}

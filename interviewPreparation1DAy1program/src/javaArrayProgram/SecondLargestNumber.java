package javaArrayProgram;

import java.util.Arrays;

public class SecondLargestNumber {
	public static int getSecondLargestNumber(int a[],int total) {
		Arrays.sort(a);
		return a[total-2];
	}
	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66,77};
		System.out.println("Second Largest Elements is: " +getSecondLargestNumber(a,7));
	}

}

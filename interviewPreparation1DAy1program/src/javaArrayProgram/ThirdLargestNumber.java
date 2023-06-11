package javaArrayProgram;

import java.util.*;

public class ThirdLargestNumber {
	public static int getThirdLargestNumber(int a[], int total) {
		Arrays.sort(a);
		return a[total - 3];
	}

	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
		System.out.println("Third Largest Elements is:" + getThirdLargestNumber(a, 8));

	}

}
package robbitNTortile;

import java.util.Scanner;

public class PrintNthElementOfArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		
		int arr[]= {1,2,4,10,5,6,4,7,8,9,20};
		
		if(n<0) {
			System.out.println("Please Enter 0 or Positive Integer");
			n=sc.nextInt();
		}
		if(n>=arr.length) {
			System.out.println("Index out of bound Please Enter Lesser Integer");
			n=sc.nextInt();
		}
			System.out.println(arr[n]+" is Present in array at index "+n);
			sc.close();	
	}
}


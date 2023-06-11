package javaNumberProgram;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int n,fact=1;
		System.out.print("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Of Number is: "+fact);
	}

}



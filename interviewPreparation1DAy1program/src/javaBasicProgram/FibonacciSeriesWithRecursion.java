package javaBasicProgram;

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {
	static int a=0,b=1,c=2,term;
	static void printFibonacci() {
		System.out.println("Enter The Term: ");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		if(term>0) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		printFibonacci();
		term--;
		}
	}
	
	public static void main(String[] args) {
		int count=10;
		System.out.print(a+" "+b);
		printFibonacci();
		
	}

}

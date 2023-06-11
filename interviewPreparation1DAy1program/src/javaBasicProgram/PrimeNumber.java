package javaBasicProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int n,count=0;
		System.out.print("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println("It Is A Prime Number");
		else
			System.out.println("It Is Not A Prime Number");
	}
	
}



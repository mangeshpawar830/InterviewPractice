package javaBasicProgram;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n,c,arm=0,rem;
		System.out.print("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
			System.out.println("It Is A Armstrong Number");
		else
			System.out.println("It Is Not A Armstrong Number");
	}

}


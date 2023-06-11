package robbitNTortile;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		int n,c,r,s=0;
		System.out.print("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
		if(c==s)
			System.out.println("It is Palendrome Number");
		else
			System.out.println("It is Not A Palendrome Number");
		
	}
}


package javaBasicProgram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,c,term;
		System.out.println("Enter The Term: ");
		
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		int j=1;
		System.out.print(a + " ");
		System.out.print(j + " ");	
//		System.out.print(b + " ");
		
		for(int i=2;i<=term;i++) {
			
				c=a+b;
				j = j + 2 ;	
				System.out.print(c + " ");
				if(j % 2 != 0 ) {
					System.out.print(j + " ");	
				}
			
				a=b;
				b=c;
					
		}
		
	}
	

}


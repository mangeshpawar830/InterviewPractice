package javaNumberProgram;

import java.util.Scanner;

public class DisplayOddNumber {
	public static void main(String[] args) {
		
		int term;
		System.out.print("Enter the term :");
		Scanner sc = new Scanner(System.in);
		term = sc.nextInt();
		for(int i=1 ; i<=term ;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
				
			}
		}
	}

}

package javaBasicProgram;

import java.util.Scanner;

public class CountNumberOfCharacterInString {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The String: ");
		String str=in.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.print("Number Of Elements In A string Are: "+count);

	}
	
	}

package javaNumberProgram;

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		
		int num = 10 ,sum = 0;
		for(int i=1 ; i<=num ; i++) {
			sum = sum+i;
			
		}
		System.out.println("Sum of the first 10 Natural Numbers is: "+sum);
	}

}

package javaBasicProgram;

import java.util.Random;

public class GenarateRandomNumber {
	public static void main(String[] args) {
		
	
	
	Random rand = new Random();
	
	//For Integer Numbers
	int rand_int = rand.nextInt(100);
	System.out.println(rand_int);
	
	//For Double Numbers
	//double rand_dbl= rand.nextDouble();
	//System.out.println(rand_dbl);
	
	}
} 

package robbitNTortile;
import java.util.Scanner;

public class FirstNPrimeNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n =sc.nextInt();
		sc.close();
		
		int count=0;
		boolean isprime=false;
		System.out.print("First "+n+" Prime Numbers is: ");
		
		
		for(int i=2;;i++) {
			isprime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			
			
			if(isprime) {
				System.out.print(i+", ");
				count++;
				if(count==n) {
					break;
				}
			}
			
		}
		
	}

}

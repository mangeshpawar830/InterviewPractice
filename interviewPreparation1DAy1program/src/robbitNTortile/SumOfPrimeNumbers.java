package robbitNTortile;


import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {

   Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();
		int sum=0;
		boolean isPrime=false;
		
		if(n1<2 || n1>n2) {
			System.out.println("Please Enter Valid Numbers");
			System.out.println("Enter First Number");
			n1=sc.nextInt();
			System.out.println("Enter Second Number");
			n2=sc.nextInt();
		}
		sc.close();
		
		for(int i=n1;i<=n2;i++) {
			isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Prime Numbers Between "+n1+" and "+n2+" is "+sum);
	}
}

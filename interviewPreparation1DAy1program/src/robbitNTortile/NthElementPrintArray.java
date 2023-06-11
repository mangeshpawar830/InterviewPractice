package robbitNTortile;
import java.util.Scanner;
public class NthElementPrintArray{
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Number :");
	int n=sc.nextInt();
	int arr[]={1,2,3,2,6,4,4,5,4,2};
	if(n<0){
		System.out.println("Enter Positive Number: ");
		n=sc.nextInt();
	}
	if(n>=arr.length){
		System.out.println("Index Out Of Bound");
		n=sc.nextInt();
	}
	System.out.println(arr[n]+" is present in index " +n);
	sc.close();
}
}
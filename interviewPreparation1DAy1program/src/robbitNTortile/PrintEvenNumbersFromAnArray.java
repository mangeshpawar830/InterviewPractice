package robbitNTortile;


public class PrintEvenNumbersFromAnArray {

	public static void main(String[] args) {

		int arr[]= {2,3,5,3,6,7,9,10,3,8};
		
		System.out.println("Even numbers from array is ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+", ");
			}
		}
	}

}

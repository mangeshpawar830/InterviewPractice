package robbitNTortile;

public class NonDuplicateElementInArray {
	public static void main(String[] args) {
		int arr[]= {1,5,5,4,2,4,5,6,3,2,4,5,1,7,8,9};
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp++;
				}
			}
			if(temp==1) {
				System.out.print(arr[i] +",");
			}
		}
	}
}

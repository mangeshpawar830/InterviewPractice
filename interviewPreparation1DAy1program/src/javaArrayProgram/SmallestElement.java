package javaArrayProgram;

public class SmallestElement {
	public static void main(String[] args) {
		 int arr[]=new int [] {11,22,33,44,1,2};
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<min)
				 min=arr[i];
		 }
		 System.out.println("Smallest Elements in Array: "+min);
	}

}

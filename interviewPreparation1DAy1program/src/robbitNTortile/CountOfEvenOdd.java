package robbitNTortile;
public class CountOfEvenOdd{
	public static void main(String[]args){
	int even = 0;
	int odd = 0;
	int arr[]={1,2,3,4,5,6,7,8,9};
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			even++;
		}else{
			odd++;
		}
	}
	System.out.println("In Given Array count of even elements are "+even+" count of odd elements are "+odd);
}
}
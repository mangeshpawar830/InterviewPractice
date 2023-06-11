package javaBasicProgram;

public class Series1 {
	public static void main(String[] args) {
		int LIMIT=128;
		int even=1;
		int odd=-1;
		int counter=1;
		while(true) {
			int max_num= counter++%2==0 ? (even*=2) : (odd+=2);
			if(max_num>LIMIT) 
				break;
			if(counter!=2) 
				System.out.print(", ");
			System.out.print(max_num);
			}
		}
	}
	

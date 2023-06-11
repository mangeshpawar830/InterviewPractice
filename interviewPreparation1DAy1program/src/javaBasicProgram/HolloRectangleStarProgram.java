package javaBasicProgram;

public class HolloRectangleStarProgram {
	public static void main(String[] args) {
		int p=4;
		int q=5;
		
		
		for(int i=1; i<=p; i++) {
			for(int j=1 ; j<=q ; j++) {
				if(i==1 || j==1 || i==p || j==q) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}

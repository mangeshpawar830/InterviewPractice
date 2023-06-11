package javaBasicProgram;

public class PanagramProgram {
	public static void main(String[] args) {
		String s="Hello world";
		ispanagram(s.toLowerCase());
		
	}

	private static boolean ispanagram(String s) {
		if(s.length()<26) {
			return false;
		}else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)< 0) {
					return false;
				}
					
			}
		}
		return true;
		
		
	}

}

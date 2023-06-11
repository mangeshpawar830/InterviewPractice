package StringPrograms;



public class ReverseString {
	public static void main(String[] args) {
		String str="Yogita",nstr=" ";
		char ch;
		System.out.print("Original String: ");
		System.out.println("Yogita");
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reverse String: "+nstr);
	}
}

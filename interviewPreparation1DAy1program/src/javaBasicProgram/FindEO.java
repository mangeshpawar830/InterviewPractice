package javaBasicProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEO {
	static List<Integer> numisRange(Integer[]num,int min,int max){
		List<Integer> numisRange =Arrays.stream(num).filter(n -> n >= min && n<= max)
				.collect(Collectors.toList());
		return numisRange;
	}
	
	public static void main(String[] args) {
		Integer num[]= {4,6,7,3,11,12,11,13,10,24,14,22};
		System.out.println("0 to 5 ->>" +numisRange(num, 0, 5).size());
		System.out.println("6 to 10 ->>" +numisRange(num, 6, 10).size());
		System.out.println("11 to 15 ->>" +numisRange(num, 11, 15).size());
		System.out.println("16 to 20 ->>" +numisRange(num, 16, 20).size());
		System.out.println("21 to 25 ->>" +numisRange(num, 21, 25).size());
		System.out.println("25 to 30 ->>" +numisRange(num, 25, 30).size());
		System.out.println("31 to above ->>" +numisRange(num, 31, Integer.MAX_VALUE).size());
	
	}
}

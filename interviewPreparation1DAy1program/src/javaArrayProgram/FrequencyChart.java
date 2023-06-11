package javaArrayProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyChart {

	static List<Integer> range(Integer[] num, int min, int max) {
		List<Integer> numInrange = Arrays.stream(num).filter(n -> n >= min && n <= max)
				.collect(Collectors.toList());
		return numInrange;
	}
	public static void main(String[] args) {
		Integer[] num = { 4, 6, 7, 3, 11, 12, 11, 13, 8, 18, 32, 21, 21, 23, 26, 2, 9, 15, 4, 11, 13, 22, 29, 17,
				15, 8, 2, 3, 26, 25, 20, 10, 5, 7, 14, 10, 24 };
		System.out.println("Frequency   ->>Count");
		System.out.println("0 to 5      ->> " + range(num, 0, 5).size());
		System.out.println("6 to 10     ->> " + range(num, 6, 10).size());
		System.out.println("11 to 15    ->> " + range(num, 11, 15).size());
		System.out.println("16 to 20    ->> " + range(num, 16, 20).size());
		System.out.println("21 to 25    ->> " + range(num, 21, 25).size());
		System.out.println("25 to 30    ->> " + range(num, 25, 30).size());
		System.out.println("31 to above ->> " + range(num, 31, Integer.MAX_VALUE).size());
	}

}

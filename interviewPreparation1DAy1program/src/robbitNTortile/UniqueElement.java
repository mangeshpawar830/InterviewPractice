package robbitNTortile;

public class UniqueElement {

	public static void main(String[] args) {

		// Declare an array which contain unique and duplicate element
		int array[] = { 2, 4, 2, 6, 5, 4, 8, 4, 9, 6 };

		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					temp++;
				}
			}
			if (temp == 1) {
				System.out.print(array[i] + ", ");
			}
		}
	}
}
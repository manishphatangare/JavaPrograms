package Array;

import java.util.Arrays;
import java.util.List;

public class OddAndEvenNumber {

	public static void main(String[] args) {

		int[] array = { 11, 23, 34, 45, 56, 67, 78, 87, 56, 56, 4534, 231, 34, 45, 5, 6, 2, 35 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.println("odd :" + array[i]);
			}

			if (array[i] % 2 == 0) {
				System.out.println("even :" + array[i]);
			}
		}

		System.out.println("************************************");
		Arrays.stream(array).filter(s -> s % 2 == 0).forEach(s -> System.out.println(s));
		System.out.println("************************************");
		Arrays.stream(array).filter(s -> s % 2 == 1).forEach(s -> System.out.println(s));

	}

}

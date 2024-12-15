package Numeric;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 2;
		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				count++;
			}
		}

		
		String result=(count==2)?"Prime":"Not Prime";
		System.out.println(result);
		
//		if (count == 2) {
//			System.out.println("Prime");
//		}
//
//		else {
//			System.out.println("Not Prime");
//		}
	}
}

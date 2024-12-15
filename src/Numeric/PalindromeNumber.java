package Numeric;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int r, rev = 0;
		int m = num;

		while (num > 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}

		if (rev == m) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}

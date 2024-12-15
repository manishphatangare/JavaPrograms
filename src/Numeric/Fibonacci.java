package Numeric;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=10;;
		
		int a=0;
		int b=1;
		int c;
		
		for (int i = 0; i < num; i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		
					
					
		}
	}
}

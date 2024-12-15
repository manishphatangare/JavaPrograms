package Numeric;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		int r;
		int sum=0;
		
		while(num>0)
		{
			r=num%10;
			sum=(int) (sum+Math.pow(r, 3));
		num=num/10;
		}
		
		System.out.println(sum);
		
	}
}

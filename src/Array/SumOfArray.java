package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArray {

	
	
	public static void main(String[] args) {
		
		int[] array = { 11, 23, 34, 45, 56, 67, 78, 2, 22, 45, 5, 6, 35, 87, 56, 56, 4534, 231, 34, 45, 5, 6, 2, 35 };

		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		
		System.out.println(sum);
		
		int sum1=Arrays.stream(array).reduce(0,(a,b)->(a+b));
		System.out.println(sum1);
		

	}
}

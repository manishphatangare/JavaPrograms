package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingArray {


	public static void main(String[] args) {
		
		int[] array = { 11, 23, 34, 45, 56, 67, 78, 2, 22, 45, 5, 6, 35, 87, 56, 56, 4534, 231, 34, 45, 5, 6, 2, 35 };
 	
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
				
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
		 for (int num : array) {
	            System.out.print(num + " ");
	        }
	}

}

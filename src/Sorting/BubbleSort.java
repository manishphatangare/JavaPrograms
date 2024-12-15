package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int array[]= {11,23,34,5,4,43,26,99,76,45,34,677,3};
		
		int temp=0;
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		for(int num:array)
		{
			System.out.println(num);
		}
	}
}

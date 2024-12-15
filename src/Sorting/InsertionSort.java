package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] array = { 64, 25, 12, 22, 11 };

		for (int i = 1; i < array.length; i++) {
		
			int current=array[i];
			int j=i-1;
			
			while(j>=0 && current <array[j])
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		
		}
		
		for(int num:array)
		{
			System.out.println(num);
		}
	}
}

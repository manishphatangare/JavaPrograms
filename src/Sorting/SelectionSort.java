package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 64, 25, 12, 22, 11 };

		for (int i = 0; i < array.length-1; i++) {
			
			int smallest=i;
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[smallest]>array[j])
				{
					smallest=j;
				}
			}
			int temp=array[smallest];
			array[smallest]=array[i];
			array[i]=temp;
			
		}
		
		for(int num: array)
		{
			System.out.println(num);
		}

	}

}

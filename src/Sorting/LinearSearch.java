package Sorting;

public class LinearSearch {

	public static void main(String[] args) {
		
		int array[]= {11,23,3,16,45,32,45,6,7,89,56,90,87};
		
		System.out.println(linearSearch(array,7));;
		
	}

	public  static int linearSearch(int[] array,int key) {
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}
}

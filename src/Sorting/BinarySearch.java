package Sorting;

public class BinarySearch {

	public static void main(String[] args) {
		
		int array[]= {11,23,34,45,56,67,76,88,89,90};
		
		System.out.println(binarySearch(array,0,9,90));
	}

	public static int binarySearch(int[] array, int l, int h, int key) {


		if(l==h)
		{
			if(array[l]==key)
			{
				return l;
			}
			else return  -1;
			
		}
		
		int mid=(l+h)/2;
		
		if(array[mid]==key)
		{
			return mid;
		}
		else if(array[mid]<key)
		{
			return binarySearch(array, mid+1, h, key);
		}
		else
		{
			return binarySearch(array,l, mid-1, key);
		}
		
		
	}
	
}

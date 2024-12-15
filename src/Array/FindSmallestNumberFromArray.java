package Array;

public class FindSmallestNumberFromArray {

public static void main(String[] args) {
		
		int array[]={11,23,34,45,56,67,87,87,765,54,45,34,23};
		
		int min=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		System.out.println(min);
	}
	
}

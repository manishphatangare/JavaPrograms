package Array;

public class FindLargesNumberFromArray {

public static void main(String[] args) {
		
		int array[]={11,23,34,45,56,67,87,87,765,54,45,34,23};
		
		int max=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.println(max);
	}

}

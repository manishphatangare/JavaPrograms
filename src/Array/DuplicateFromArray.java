package Array;

public class DuplicateFromArray {

	public static void main(String[] args) {

		int[] array = { 11, 23, 34, 45, 56, 67, 78, 2, 22, 45, 5, 6, 35, 87, 56, 56, 4534, 231, 34, 45, 5, 6, 2, 35 };

		for (int i = 0; i < array.length; i++) {

			int count=1;
			
			for (int j = i + 1; j < array.length; j++)

			{

				if(array[i]==array[j])
				{
					count++;
			
					System.out.println("Duplicate Element is :"+array[i]+" and count is : "+count);
				}
				
			}
			

		}

	}

}

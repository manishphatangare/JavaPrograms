package Array;

public class ReverseArraybyswap {

	
public static void main(String[] args) {
		
		int[] array = { 11, 23, 34, 45, 56, 67, 78, 2, 22, 45, 5, 6, 35, 87, 56, 56, 4534, 231, 34, 45, 5, 6, 2, 35 };

		int temp=0;
		for(int i=0,j=array.length-1;i<array.length/2;i++,j--)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}

      for (int num : array) {
      System.out.print(num + " ");
  }
      
}
}

package Array;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int array[][]= {{11,23,34,45,56,67,78,43,54,65,768},{43,65,86,43,97,4898,2323,923},{10,92,35,638,9253,8345}};
		
		int max=array[0][0];
		int min=array[0][0];
		
		for(int i=0;i<array.length;i++)
		{
			
			for(int j=0;j<array[i].length;j++)
			{
				if(max<array[i][j])
				{
					max=array[i][j];
				}
				
				if(min>array[i][j])
				{
					min=array[i][j];
				}
			}
		}
		System.out.println(min +" and "+max);
		
		
	}
}


package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicateFromArray {

	
	public static void main(String[] args) {
		

		int[] array = { 11, 23, 34, 45, 56, 67, 78, 2, 22, 45, 5, 6, 35, 87, 56, 56, 4534, 231, 34, 45, 5, 6, 2, 35 };
 	
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			
			set.add(array[i]);
		}
		
	
Object[] array1=set.toArray();

for(Object num:array1)
{
System.out.print(num+",");	
}
System.out.println("");
		
	System.out.println(set);
		
//		for(int i=0;i<array.length;i++)
//		{
//			for(int j=i+1;j<array.length;j++)
//			{
//				
//				if(array[i]==array[j])
//				{
//					array.
//					
//				}
//			}
//		}
	}
	
}

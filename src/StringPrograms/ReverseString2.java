package StringPrograms;

import java.util.Scanner;

public class ReverseString2 {

	//Reverse String 
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		
	}


}

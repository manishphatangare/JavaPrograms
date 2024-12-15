package StringPrograms;

import java.util.Scanner;

public class ReverseString {

	//Reverse String by creating new String
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String newname="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			newname=newname+name.charAt(i);
		}
		
		System.out.println(newname);
	}
}

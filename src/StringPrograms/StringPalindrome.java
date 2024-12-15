package StringPrograms;

import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String newname="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			newname=newname+name.charAt(i);
		}
		
		System.out.println(newname);
		
		if(name.equalsIgnoreCase(newname))
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}



}

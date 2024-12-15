package StringPrograms;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name="My Name is Sid";
		String newName[]=name.split(" ");
		for(int i=0;i<newName.length;i++)
		{
			for(int j=newName[i].length()-1;j>=0;j--)
			{
				System.out.print(newName[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}

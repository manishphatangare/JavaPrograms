package StringPrograms;

import java.util.Scanner;

public class ReverseString3 {

	//Reverse String by StringBuilder
	
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			
			StringBuilder builder=new StringBuilder();
			
			builder.append(name);
			
			System.out.println(builder.reverse());
			
		}

	
}

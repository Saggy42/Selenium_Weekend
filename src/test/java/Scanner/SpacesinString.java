package Scanner;

import java.util.Scanner;

public class SpacesinString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int with_space=name.length();
		int Without_Space=name.replace(" ", "").length();
		
		int count=with_space-Without_Space;
		System.out.println(count);
		sc.close();
	}

}

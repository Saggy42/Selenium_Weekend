package Scanner;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter string name: ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		
		System.out.println("Reverse String:"+rev);
		
		
	}

}

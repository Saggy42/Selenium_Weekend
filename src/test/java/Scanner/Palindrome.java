package Scanner;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string: ");
		Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String rev="";
        for(int i=input.length()-1;i>=0;i--)
        {
        	rev=rev+input.charAt(i);
        }
       // System.out.println(rev);
        if(input.equals(rev))
        {
        	System.out.println("Given string is palindrome.");
        }
        else
        {
        	System.out.println("Given string is not palindrome.");
        }
      sc.close();
	}	
}


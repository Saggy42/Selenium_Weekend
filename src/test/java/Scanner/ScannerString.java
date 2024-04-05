package Scanner;

import java.util.Scanner;

public class ScannerString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		
		String Name=sc.next();
		System.out.println("My Name is "+Name);
		
	}

}

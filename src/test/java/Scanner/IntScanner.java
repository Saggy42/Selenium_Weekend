package Scanner;

import java.util.Scanner;

public class IntScanner {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		if(num%2==0){
			System.out.println("This is even number");
		}
		
		else {
			System.out.println("This is odd number");
		}
		
		
		
	}

}

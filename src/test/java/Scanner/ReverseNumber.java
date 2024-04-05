package Scanner;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		
		while(num>0) 
		{
		rem=num%10;
		num=num/10;
		System.out.print(rem);
			
		}
		sc.close();
		
		
		
	}

}

package Scanner;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("enter Number: ");
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		
		for(int i=2;i<Number;i++) {
			
			if(Number%i==0) {
				
				System.out.println("Number is not Prime");
				break;
				
			}
			
			else {
				System.out.println("Number is Prime");
				break;
			}
			
		}
		
	}

}

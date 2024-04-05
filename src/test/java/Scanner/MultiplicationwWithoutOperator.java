package Scanner;

import java.util.Scanner;

public class MultiplicationwWithoutOperator {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers: ");
		Scanner sc=new Scanner(System.in);
		int Num1=sc.nextInt();
		int Num2=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=Num2;i++)
		{
			sum=sum+Num1;
		}
		
		System.out.println("Multiplication is "+sum);
	}

}

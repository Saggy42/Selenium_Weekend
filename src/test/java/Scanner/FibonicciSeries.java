package Scanner;

import java.util.Scanner;

public class FibonicciSeries {
	
	public static void main(String[] args) {System.out.println("Enter number to find series upto: ");
	Scanner sc=new Scanner(System.in);
    int input = sc.nextInt();
    int sum=0;
    int i1=0,i2=1;
    System.out.print(i1+" + "+i2+" + ");
    while(i2<input)
    {
    	sum=i1+i2; 
    	i1=i2;
    	i2=sum;
    	if(sum>input)
    	{
    		break;
    	}
    	else
    	{
    	System.out.print(sum+" + ");
    	}
    }
 sc.close();
}	


		
	}



package ControlStatement;

public class If_Study {

	public static void main(String[] args) {
		
		
		int marks=75;
		
		if(marks>=35)    /*If we remove the curly braces after the if statement, 
			               then by default first print statement will execute and remaining 
			               will go in else. This condition satisfies only if we are not 
			               giving curly braces after if statement*/
			
		{
			System.out.println("You are Pass");
		}
		
		else {
			System.out.println("You are Fail");
		}
		

	}

}

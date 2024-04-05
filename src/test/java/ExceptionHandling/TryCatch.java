package ExceptionHandling;

public class TryCatch {
	
	public static void main(String[] args) {
		
		try {                         //Click try and control+Space
			
			int a=100/0;
			//System.out.println("Rest code"); -->>This will not execute if the exception occurs
			
		} catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		
		System.out.println("Rest of the code will execute");
		
	}

}

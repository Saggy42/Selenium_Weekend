package ExceptionHandling;

public class Exception1 {
	
	public static void main(String[] args) {
		
		try {
			int a=50/0;
		} 
		
		catch (Exception e) {  //Use when we are not sure about exception
			System.out.println(e);
			System.out.println("Rest of the code will execute");
			
		}
		
	}

}

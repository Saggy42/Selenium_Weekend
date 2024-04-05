package ExceptionHandling;

public class Finally {
	
	public static void main(String[] args) {
		
		try {
			int a=25/0;
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		finally {
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("Rest of the code");
		
	}

}

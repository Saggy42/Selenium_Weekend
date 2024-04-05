package ExceptionHandling;

public class ArrayOutOfBound {
	
	public static void main(String[] args) {
		
		
		
		try {
			int a[]= {10,20,30,40};
			System.out.println(a[10]);
		} 
		
		catch (Exception e) {
			
			System.out.println(e);
			System.out.println("Rest of the code");
			
		}
				
				
		}
		
	}



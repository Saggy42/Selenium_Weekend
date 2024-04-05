package ExceptionHandling;

public class Exception2 {
	
	public static void main(String[] args) {
		
		int i=50;
		int j=0;
		int d;
		try {
			
			d=i/j;
			
		} catch (Exception e) {
			d=(i/(j+2));
			System.out.println(d);
		}
		
	}

}

package JavaMethods;

public class MathOperation {
	
	
	
	public static void main(String[] args) {
		
		MathOperation s1= new MathOperation();
		s1.addition();
		s1.substraction();
		
	}
	
	
	public void addition() {
		
		int a=50; int b=30;
		
		int c=a+b;
		
		System.out.println("The addition is "+ c);
		
	}
	
	
	public void substraction() {
		
		int a= 100;
		int b=25;
		int c= a-b;
		
		System.out.println("The substraction is "+c);
	}

}

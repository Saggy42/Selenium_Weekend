package JavaMethods;

public class GlobalLocalVariable {
	
	static int a=75;  //Global variable declared (Use static keyword for global variable declaration)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		local();       //local method called
		
		GlobalLocalVariable a= new GlobalLocalVariable();
		a.global();
		
	}
	
	public static void local() {
		int b=80;       //Local variable declared
		
		System.out.println("The value of Local Variable is "+b);  
		
		// Local Variable can be only accessible within the method
		
		System.out.println("The value of Global Variable is "+a);
		
		// Global Variable can be accessible everywhere within the class
		
		
		
	}
	
	public void global() {
		System.out.println("The value of Global Variable is "+a);
	}

}

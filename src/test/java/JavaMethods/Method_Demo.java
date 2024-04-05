package JavaMethods; // Control+Shift+F is used to arrange the code properly

public class Method_Demo {

	public static void main(String[] args) {// void is return type (Null).. It will be void for main method
		System.out.println("This is main method");
		
		Method_Demo s= new Method_Demo();
		
		
		demo();
		s.sagar();
		
		MathOperation s1= new MathOperation();// Calling methods from another class
		s1.addition();
		s1.substraction();
	}
	
	public static void demo() {// Static Regular Method
		
		//Can be called by calling directly method name in main method.
		
		System.out.println("This is another method");
		
	}
	
	public void sagar() {  // This is non static method
		// To call this object needs to be created in main method
		
		System.out.println("This is non static method");
	}

}

package JavaMethods;

public class MethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameters a = new MethodParameters();
		a.mul(); // ---------- without parameter method call
		a.mul(30, 3); // ---------- with parameter method call
		
		int d=mul1(5,6);
		System.out.println("The multiplication is "+ d);
		

	}

	public void mul() { // Method without parameters
		int a, b, mul;
		a = 20;
		b = 10;
		mul = a * b;

		System.out.println("The Multication is " + mul);
	}

	public void mul(int c, int d) { // Method with Parameters
		int mul = c * d;

		System.out.println("The Multication with Parameter is " + mul);
	}
	
	public static int mul1(int i, int j) {
		int e=i*j;
		return e;
		
		
	}

}

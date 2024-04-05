package ControlStatement;

public class NestedIf {

	public static void main(String[] args) {
		
		String address= "Noida,India";
		
		if(address.endsWith("India")) {
			
			if(address.contains("Meerut")) {
				System.out.println("Your city name is Meerut");
			}
			
			else if(address.contains("Noida")) {
				
				System.out.println("Your city name is Noida");
				
			}
			
			else {
				System.out.println("You are not living in India");
			}
			
		}

	}

}

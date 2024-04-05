package Star_Pattern;

public class Program9 {
	
	public static void main(String[] args) {
		
		//*******
		// *****
		//  ***
		//   *
		
		
		int star=7;
		int space=0;
		
		for(int i=0;i<4;i++) {
			
			for (int j = 1; j <=space; j++) {    // Inner for Loop	
				System.out.print(" ");
				
			}
			
		for (int j = 1; j <=star; j++) {     // Inner for Loop
				System.out.print("*");
	
			}
			System.out.println();
			space++;             // Increment of Space by 1
			star=star-2;         // Decrement of Star by 2	
		}	
	}
	
}


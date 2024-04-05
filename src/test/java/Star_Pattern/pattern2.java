package Star_Pattern;

public class pattern2 {
	
	public static void main(String[] args) {
		
		
		char k='*';
		
		for (int i=1; i<=6; i++) {
			
			for(int j=1; j<=i;j++) {
				
				System.out.print("*");
				System.out.print('\t');
			}
			
			System.out.println();
			k++;
		}
	}

}

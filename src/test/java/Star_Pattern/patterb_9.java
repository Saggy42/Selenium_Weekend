package Star_Pattern;

public class patterb_9 {
	
	
		public static void main(String[] args) {
			
			int star=5;
			int space=0;
			
			for(int i=1; i<=5;i++) {
				
				for(int j=1;j<=space;j++) {
					
					System.out.print(" ");
				}
					
					for(int j1=1;j1<=star;j1++) {
						
						System.out.print("*");
					}
					
					System.out.println();
					
					space++;
					star--;
				}
			}
		}

	




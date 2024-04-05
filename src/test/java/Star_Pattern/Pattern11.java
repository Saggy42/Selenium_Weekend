package Star_Pattern;

public class Pattern11 {
	
	public static void main(String[] args) {
		
		
		//   *
		//  * *
		// * * *
		//* * * *
		
int space=3;
int star=1;

for(int i=0;i<4;i++) {
	
	for(int j=0;j<space;j++) {
		System.out.print(" ");
	}
	
	for(int k=0;k<star;k++) {
		System.out.print("* ");
	}
	
	System.out.println();
	space--;
	star++;
}
		

	}

}

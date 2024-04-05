package Star_Pattern;

public class Pettern10 {
	
	public static void main(String[] args) {
		
		//   *
		//  ***
		// *****
		//*******
		
int space=3;
int star=1;

for(int i=0;i<4;i++) {
	
	for(int k=0;k<space;k++) {
		
		System.out.print(" ");
	}
	
	for(int m=0;m<star;m++) {
		
		System.out.print('*');
	}
	System.out.println();
	space--;
	star=star+2;
	
}

		
	}

}

package Array;

public class StringArray {

	public static void main(String[] args) {

		String name1 = "Ram";
		String name2 = "Sita";

		char grade1 = 'A';
		char grade2 = 'B';

		int Roll1 = 1;
		int Roll2 = 2;

		String ar[] = new String[4]; // Array of Strings

		ar[0] = "Technogeeks"; // Initialization
		ar[1] = "Software";
		ar[2] = "Testing";
		ar[3] = "Centre";

		System.out.println(ar.length);

		System.out.println(ar[0]);

		for (int i = 0; i < ar.length; i++) {// i.e.  i<4
			System.out.println(ar[i]);
		}

		// Step 5: a.length-1

		for (int j = 0; j <= ar.length - 1; j++) {

			System.out.println(ar[j]);
		}
		
		//Step 6:
		
		for(int k=3;k>=0;k--) {         //Decrement the value 
			System.out.println(ar[k]);
		}
		
		//Step 7:
		
		for(int m=ar.length-1;m>=0;m--) {
			
			System.out.println(ar[m]);
		}
	}
}

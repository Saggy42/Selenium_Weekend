package Array;

public class IntArray {

	public static void main(String[] args) {

		int RollNo[] = new int[6];

		RollNo[0] = 11;
		RollNo[1] = 20;
		RollNo[2] = 33;
		RollNo[3] = 40;
		RollNo[4] = 55;
		RollNo[5] = 60;
		
		//Step 1:
		
		for (int i=0;i<RollNo.length;i++) {
			
			System.out.println(RollNo[i]);
		}
		
		//Step 2:
		
		System.out.println(RollNo[0]);
		
		//Step 3:
		
		for(int j=0;j<=5;j++) {
			
			System.out.println(RollNo[j]);
		}
		//Step 4:
		
		for(int k=0;k<=RollNo.length-1;k++) {
			System.out.println(RollNo[k]);
		}
		
		//Step 5:
			
		for(int m=5; m>=0;m--) {
			System.out.println(RollNo[m]);
		}
		
	   for(int h=0;h<RollNo.length;h++) {   //To get even number
		   
		   if(RollNo[h]%2==0) {
			   System.out.println("Even Array is "+RollNo[h]);
		   }
		   else {
			   System.out.println("Odd Array is "+RollNo[h]); //To get odd number
		   }
		   

	}
	   
	int sum=0;
	
	for(int a=0;a<RollNo.length;a++) {
		
		sum= sum+RollNo[a];
		
		
	}
	
	System.out.println("Addition is "+sum);
			
			
	}
}

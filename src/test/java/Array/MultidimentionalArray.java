package Array;

import java.util.Arrays;

public class MultidimentionalArray {
	
	public static void main(String[] args) {
		
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		
		System.out.println(arr[0][1]);
		
		System.out.println(arr[0][0]);
		
		System.out.println(arr[1][2]);
		
		System.out.println(arr[2][2]);
		
		for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=2;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}

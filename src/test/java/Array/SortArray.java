package Array;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int money[]=new int[6];
		
		money[0]=50;
		money[1]=20;
		money[2]=10;
		money[3]=40;
		money[4]=30;
		money[5]=60;
		
		//System.out.println(money[4]);
		
		Arrays.sort(money);  //To sort the array in ascending order
		
		for(int i=0;i<=5;i++) {
			System.out.println(money[i]);
		}
		
		for(int k=5;k>=0;k--) {  //To sort the array in descending order
			
			System.out.println(money[k]);
		}
		
		
	}

}

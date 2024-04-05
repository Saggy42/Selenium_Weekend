package Casting;

public class NarrowingTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double i=166.66;
		
		long j= (long)i;  //for narrowing casting bracket is must..(long)i
		
		int k= (int)j;
		
		System.out.println("before conversion "+i);
		
		System.out.println("After conversion into long "+j);
		
		System.out.println("After conversion into int "+k);
		
		
		
				

	}

}

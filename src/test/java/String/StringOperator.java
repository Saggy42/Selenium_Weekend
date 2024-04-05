package String;

public class StringOperator {
	
	public static void main(String[] args) {
		
		
		String s1="Technogeeks";
		
		String s2="Technogeeks";
		
		String s3=new String("Technogeeks");
				
		System.out.println(s1==s2);
		System.out.println(s2==s3); 
		//== checks the address or memory location and .equal method compares the value
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}

package String;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s="technogeek";   // Constant pool is declared and without using the new keyword 
		String s1="technogeek";
		String s2="tech";
		String s3="Test";
		String s4="ABC";
		
		
		String m= new String("technogeek");
		// Non Constant Pool is declared and using the new keyword 
		
		String m1=new String("technogeek");
		
		String m2=new String("TECHNOGEEK");
		
		String m3=new String("");
		
		String m4 = new String("Java Classes");
		
		
		System.out.println(s==s1); 
		// Value true is printed "technogeek" is equal to "technogeek"
		
		System.out.println(s==m);  
		// Value of s is technogeek and value of m is technogeek and memory area is stored in different heap area 
		
		System.out.println(m1.equals(m)); 
		// Value of the m is technogeek and m1 is technogeek so it got matches // true 
		
		System.out.println(m1.equals(m2)); 
		// Value of m1 is technogeek and m2 is TECHNOGEEK is displayed // False
	
		System.out.println(m1.equals(m));  
		// Value is matches of the non constant pool so it get result as true 
		
		System.out.println(s1.equals(m));  
		// in Equal method it check the value is same is it written as true value 
		
		
		System.out.println(m1.equalsIgnoreCase(m2)); 
		//m1-> technogeek m2-> TECHNOGEEK, we ignored the case so the condition is true
		
		
		System.out.println(s1.toUpperCase());  
		//  Lower case to Upper Case is Displayed "TECHNOGEEK" -> "technogeek"
		
		System.out.println(m2.toLowerCase()); 
		// Upper case to Lower Case is Displayed "TECHNOGEEK" -> "TECHNOGEEK"
		
		System.out.println(m.length());  
		// Here Length is Printed as 10 "technogeek"
		
		System.out.println(m.charAt(6)); 
		// String value "technogeek" has a 6 index place is "g"
		
		System.out.println(m2.isEmpty()); 
		// In m2 the () is not empty so written as false value in it 
		
		
		System.out.println(m.contains("geek"));  
		// In the m value we are writting the "technogeek" so in that we have take "geek"
		
		System.out.println(m2.isEmpty()); 
		// In the m2 we are not getting the empty value "TECHNOGEEK" written as false value in it 
		
		System.out.println(m3.isEmpty());  
		// In the m3 we are getting the empty value so written as true value in it 
		
		System.out.println(m2.charAt(7));  
		// E is display "TECHNOGEEK"
		
		System.out.println(m2.endsWith("OGEEK")); 
		// "TECHNOGEEK" it is true 
		
		System.out.println(m2.startsWith("TECH")); 
		// "TECHNOGEEK" it is true if "technogeek" it get the false 
		
		System.out.println(m2.substring(3));  
		// TECHNOGEEK-> HNOGEEK (Subtring start from 0 to 3 at 3rd postion it wil print )
		
		System.out.println(m2.substring(1,5)); 
		// TECHNOGEEK-> ECHN (Subtring start from 1->5)
		
		System.out.println(m1.concat(m4)); 
		// m1-> technogeek and m4->Java Classes (Join the value in the string)
		
		 
		System.out.println(s3.concat("Pune"));  
		// s3-> Test value and it concat with "Pune"
		
		System.out.println(s3); 
		// Only displayed the s3 value "Test"
		
		 s4=s4+"Software_Testing";   
		 //To concat the value 
		System.out.println(s4);
		
		
		System.out.println(s4.length()); 
		// Length of the s4 is ABCSoftware Testing-> 19 length  (Length start from 1-> 10)
		
		System.out.println(s4.indexOf("g")); 
		// ABCSoftware Testing-> displayed as 18 (Index is start from 0-> 10)
		
		System.out.println(s4.lastIndexOf("e"));  
		// ABCSoftware_Testing is displayed as 13 (Index start from 0-> 10 )
		
		System.out.println(m4.replace("Java", "Manual")); 
		// "Java Classes"-> "Manual Classes "
		
		String m5 = m4.replace("Java", "Manual");  
		// creates a m5 new string and m4-> "Java is replace to Manual 
		
		System.out.println(m4);  // Java Classes  
		
		System.out.println(m5);  // Manual Classes 
	
			
	}
		
}

	
		
		
		




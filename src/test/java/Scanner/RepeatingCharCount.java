package Scanner;

import java.util.Scanner;

public class RepeatingCharCount {
	
	public static void main(String[] args) {
	
	System.out.println("Enter string: ");
	Scanner sc=new Scanner(System.in);
    String input = sc.nextLine();
    String dup="";
    for(int i=0;i<input.length();i++)
    {
    	String c=Character.toString(input.charAt(i));
    	int count=input.split(c).length-1; //returns length after split
    	if(dup.contains(c))
        {
        	continue;
        }
        else 
        {
        	
        	if(count>1)
        	{
        		System.out.println("occurrence of duplicate char "+c+" is:"+count);
        	}
        }
    	dup=dup+c;
    }

    sc.close();
}	
}






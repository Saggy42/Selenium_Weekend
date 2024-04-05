package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUSe {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Technogeek");//0
		al.add("May-21");//1
		al.add(90);//2
		al.add('A');//3
		al.add(99.99f);//4
		al.add("Technogeek");//5
		al.add(null);//6
		al.add(null);//7
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("Technogeek"));
		System.out.println(al.lastIndexOf("Technogeek"));
		al.set(2, 30);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains(99.99f));
		System.out.println(al.get(6));
		
		al.add(1,"Sagar");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
		
		Iterator it=al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
			
			
		}
	

		
		
	}
	
	
	
	
	




}

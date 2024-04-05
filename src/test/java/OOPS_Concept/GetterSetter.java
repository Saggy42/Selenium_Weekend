package OOPS_Concept;

public class GetterSetter {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
	
		
		GetterSetter g=new GetterSetter();
		g.setName("Sagar");
		g.setAge(25);
		
		System.out.println("The name is "+g.name);
		System.out.println("The age is "+g.age);
		
	}

}

package JavaMethods;

public class HR1Portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails Sagar=new EmployeeDetails(); 
		//creating object to call non static method from another class
		Sagar.Employee_ID=1679146;
		Sagar.Salary=100000;
		Sagar.RM="Rohan";
		
		Sagar.EmpDetails();  //Calling Method from another Class
		
		EmployeeDetails Kajal=new EmployeeDetails(); 
		//creating object to call non static method from another class
		Kajal.Employee_ID=1679148;
		Kajal.Salary=900000;
		Kajal.RM="Rishi";
		
		Kajal.EmpDetails(); //Calling Method from another Class
		
				
	}

}

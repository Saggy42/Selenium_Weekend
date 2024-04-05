package Udemy;

public class Interfaces implements IndianTraffic{ // use keyword implements with interface name to use interfaces and then click on erroe and check unimplemented methods
	
	public static void main(String[] args) {
		
		IndianTraffic a=new Interfaces();  // Use Interface name s= new Classname
		a.Green();
		a.Red();
		a.Yellow();
	}

	@Override
	public void Green() {
		
		System.out.println("Green Go");
	}

	@Override
	public void Red() {
		
		System.out.println("Stop Red");

	}

	@Override
	public void Yellow() {
		
		System.out.println("Yellow Watch and Go");

	}

}

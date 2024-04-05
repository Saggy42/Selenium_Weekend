package Constructor;

public class MathOperation {
int a;// global variable declaration
int b;
int c;
int sum;

public MathOperation() //user defined without/zero parameter
{

a=10; //use of constructor to initialize variable
b=20;
c=30;
}
public MathOperation(int x)// user defined with single parameter constructor
{
a=x;//90
}
public MathOperation(int x,int y)// user defined with two parameter constructor
{
a=x;
b=y;
}
public MathOperation(int x,int y, int z)//user defined with three parameter constructor
{
a=x;
b=y;
c=z;
}
public static void main(String[] args)
{
MathOperation m= new MathOperation();// constructor is called when an object is created
m.addition();
MathOperation m1= new MathOperation(90);
m1.addition();
MathOperation m2= new MathOperation(1, 2);
m2.addition();
MathOperation m3= new MathOperation(7, 8, 9);
m3.addition();
}
public void addition()// non static method
{
sum=a+b+c;
System.out.println("Addition is "+sum);
}
}

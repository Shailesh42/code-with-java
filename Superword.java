package practical;

class Super_Class {
 int a ;
 int b ;
 int e;
     Super_Class()
     {
       System.out.println("Parent class constructor called ."); 
     }
     Super_Class(int x,int y)
     {  
      	a = x;
    	b = y;
     }
     void display()
     {
    	 System.out.println("In the parent class the variable \na = "+ a +" \nb = "+ b );
     }
}
class DerivedClass extends Super_Class
{
	int c ;
	int d ;
	DerivedClass()
	{
		super();
		System.out.println("The derived class constructor called ");
	}
	DerivedClass(int a,int b,int c,int d)
	{
		super(a,b);
		this.c= c;
		this.d = d;
		super.e = d ;
	}
	void display()
	{
		super.display();
		System.out.println("In the derived class the variable \nc = "+ c +" \nd = "+ d );
		System.out.println("In the parent  class the variable initlize in derived class \ne = "+ e );
	}
}
public class Superword
{
	public static void main(String a[])
	{   
		System.out.println("Demonstration of super keyword ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
		DerivedClass der_obj = new DerivedClass();
		DerivedClass der_obj2= new DerivedClass(4,5,6,7);
		der_obj2.display();
	}
}

package practical;
public class Static {
	static int x = 8;
	public static void  method()
	{
		System.out.println("Static method access by directly class name without any object ");
		System.out.println("Static varible x = "+x);
	}
	 public static void main(String a[])
	  {   
		  System.out.println("         Demonstration of Static method and member  ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
		  Static.method();
		 
		   	
	  }
}

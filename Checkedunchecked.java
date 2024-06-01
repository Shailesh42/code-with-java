package practical;
import java.io.IOException;
import java.util.*;
class CheckedExp
{   
	void n() throws IOException
	{
	 throw new IOException("find checked exception");
	}
}

public class Checkedunchecked {
   public static void main(String str[])
   {  
    System.out.println("Demonstration of checked and unchecked exception ");
	System.out.println("******************************************************************** ");
	System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	System.out.println("******************************************************************** ");
	CheckedExp obj  = new CheckedExp();
	try
	{
		
		obj.n();
	}
	catch(Exception e)
	{
		System.out.println("Checked Exception occured "+e );
	}
	try
	{
		int x = 50 /0 ;
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Found an unchecked exception  "+e);
	}
   }
}
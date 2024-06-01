package practical;
import java.util.*;
class WordException extends Exception 
{
   String name ;
   WordException (String a)
   {
   name = a;
   }
   public String toString()
   {
   return  "(Exception occured )\nInvalid country name  " + name ;
   }
 }
public class WordMismatchException {
  public static void main (String str[])
	{
      String name ;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the country name : ");
	
	try
	{
		name = scan.next();
		if(!name.equalsIgnoreCase("India"))
		{
			throw new WordException(name);
			
		}
		else
		{
			System.out.println("Welcome to  " + name);
		}
	}
	catch(WordException  ex)
	{
		System.out.println(ex);
	}
	finally
	{
		scan.close();
	}
	System.out.println("The end of code .");
	}
}

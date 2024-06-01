package practical;
import java.util.*;
class MyNation extends Exception
{
	MyNation(String s)
	{
		super(s);
	}
}
class Nation 
{
	void match(String s )
	{ try {
	 if(!(s.equals("jai hind") || s.equals("JAI HIND")))
		 throw new MyNation("Not acceptable");
	 else
		System.out.println("String accepted");
	}
	catch (MyNation e)
	{
		System.out.println(e);
	}
	}
}
public class CreateThread {
  public static void main(String str[])
  {
	  System.out.println("Demonstration of Userdefined Exception ");
	  System.out.println("******************************************************************** ");
	  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	  System.out.println("******************************************************************** ");
    Nation  obj = new Nation();
    System.out.print("Enter the string : ");
    String s ;
    Scanner scan = new Scanner(System.in);
    s = scan.nextLine();
    obj.match(s);
    System.out.println("PRogram completed ");
    scan.close();
   }  
}

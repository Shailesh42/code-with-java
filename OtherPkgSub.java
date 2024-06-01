package p2;
import p1.InsideOwnClass;

public class OtherPkgSub extends InsideOwnClass
{
  public void show()
	{
		 System.out.println("Her private member[priv_var] is non accesssible here ");
		  System.out.println("Her private member[prot_var] is accesssible here "+prot_var);
		  System.out.println("Her private member[pub_var] is accesssible here "+pub_var);
		  System.out.println("Her private member[default_var] is non accesssible here ");
	}
	
	public static void main(String a[])
	  {
		  System.out.println("Demonstration of access specifier ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
		  OtherPkgSub ob = new  OtherPkgSub();
		  ob.show();
	  }
}

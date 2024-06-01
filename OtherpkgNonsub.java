package p2;

import p1.InsideOwnClass;

public class OtherpkgNonsub {
	static void show()
	  {   InsideOwnClass ob = new InsideOwnClass();
		  System.out.println("Her private member[priv_var] is non accesssible here " );
		  System.out.println("Her protected member[prot_var] is non accesssible here ");
		  System.out.println("Her public member[pub_var] is accesssible here "+ob.pub_var);
		  System.out.println("Her default member[default_var] is non accesssible here ");
	  }
	  public static void main(String a[])
	  {
		  System.out.println("Dewmonstration of access specifier ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
		  show();
	  }
	}


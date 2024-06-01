package practical;
import java.util.Scanner;
public class Tellcall {
   String phno, sname;
   double n, amt ;
   Tellcall(String no, String name,Double callno)
   {
	   phno = no;
	   sname = name ;
	   n = callno;
	   compute(n);
   }
   void compute(double n)
   {  amt = 500.00;
	   if(n  <= 100.00) ;
	   else if(n <= 200.00)
		   amt += n ;
	   else if( n <= 300.00)
		   amt += n*1.2;
	   else 
		   amt += n*1.5;
  }
   void display()
   {
	 System.out.println("Suscriber name : "+ sname);
	 System.out.println("Phone no : "+ phno);
	 System.out.println("No of calls : "+ n);
	 System.out.println("the bill amount is : "+ amt+"(500 rs rental charge + "+ ((amt-500)/n)+ "Rs per call" +"("+ (amt-500)+ "))");
   }
   public static void main(String[] arg)
   { 
	   System.out.println("         Demonstration of constructor and method  ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
	   Scanner scan  = new Scanner(System.in);
	   System.out.print("Enter Suscriber name : ");
	   String name = new String(scan.nextLine());
		 System.out.print("Enter Phone no : ");
		  String phno = new String(scan.next());
		 System.out.print("Enter No of calls : ");
		  double n = scan.nextDouble();
		  Tellcall obj= new Tellcall(phno,name,n);
		  obj.display();
		 scan.close();
   }
}

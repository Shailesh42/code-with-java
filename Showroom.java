package practical;
import java.util.Scanner;
public class Showroom {
	public static void main(String args[])   
	{   
	    System.out.println("Demonstration of if else and switch statement  ");
		System.out.println("******************************************************************** ");
		System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		System.out.println("******************************************************************** ");
		System.out.println("Choose the option \n1.for Mill cloth \n2.Handloom items \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the option  : ");
		int typecloth = sc.nextInt();
		System.out.print("Enter the amount : ");
		double purchageamount = sc.nextDouble();
		double discount =0 ;
		switch(typecloth)
		{  case 1:
		{
			if(purchageamount <= 100 )
				discount = 0 ;
			else if(purchageamount <= 200)
				discount = purchageamount*0.05 ;
			else if(purchageamount <= 300)
	            discount = purchageamount*0.075 ;
			else
				discount = purchageamount*0.1;
		}
		case 2 :
		{
			if(purchageamount <= 100 )
				discount = purchageamount*0.05 ;
			else if(purchageamount <= 200)
				discount = purchageamount*0.075 ;
			else if(purchageamount <= 300)
	            discount = purchageamount*0.1 ;
			else
				discount = purchageamount*0.15;
		}
		}
		double dscount = discount*100/purchageamount;
		System.out.println("discount on "+ typecloth +"on purchageamount discount is "+ discount+"("+ dscount+"%)" );
		sc.close();
	} 
}

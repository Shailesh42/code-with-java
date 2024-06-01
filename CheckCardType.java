package practical;
import java.util.*;
interface card
{
	public abstract void cardcheck(String num);
}
class Mastercard implements card 
{
   public void cardcheck(String num)
   {
	  if(num.charAt(0)== '5' && ( num.charAt(1)>= '1' && num.charAt(1) <=  '5'))
			  if(num.length()== 16)
				 { System.out.println("Card accept sccessfully ") ;
			       return ;  }
		System.out.println("Invalid card number ");	  
   }
}
class Visa implements card 
{
   public void cardcheck(String num)
   {
	  if(num.charAt(0)== '4' )
			  if(num.length() <= 16 && num.length() >= 13)
				 { System.out.println("Card accept sccessfully ") ;
			       return ;  }
		System.out.println("Invalid card number ");	  
   }
}
class American_express implements card 
{
   public void cardcheck(String num)
   {
	  if(num.charAt(0)== '3' && ( num.charAt(1)>= '4' && num.charAt(1) <=  '7'))
			  if(num.length()== 15)
				 { System.out.println("Card accept sccessfully\n ") ;
			       return ;  }
		System.out.println("Invalid card number\n ");	  
   }
}
public class CheckCardType {
  public static void main(String a[])
  {   
	  System.out.println("Demonstration of polimorphisum ");
	  System.out.println("******************************************************************** ");
	  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	  System.out.println("******************************************************************** ");
	  Scanner scan = new Scanner(System.in);
	  while(true)
	  {
	  System.out.print("Choose the card type \n1.Master card \n2.Visa card \n3.American Express\nEnter the option : ");
	  
	  int n = scan.nextInt();
	  card  checkCard ;
	  String  number ;
	  System.out.print("Enter the card Number : ");
	  number = scan.next();
	 if( n== 1 )
		 checkCard = new Mastercard();
	 else if (n== 2)
		 checkCard = new Visa();
	 else if(n==3 )
		 checkCard = new American_express();
	 else break ;
	 checkCard.cardcheck(number);
	 
  } 
	  scan.close();
  }
}

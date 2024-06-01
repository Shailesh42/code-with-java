package practical;

import java.util.Scanner;
class Bankdetail {
   String hname;
   String accNumber;
   String accType ;
   double balanceamt ;
   Bankdetail(String hname ,String accnumber,String acctype ,double balanceamt)
   {
      this.hname = hname ;
      this.accNumber = accnumber;
      this.accType  = acctype ;
      this.balanceamt = balanceamt;
   }
   void deposit(double amount)
   {   
	   balanceamt += amount ;
	   System.out.println("The balace amount is "+balanceamt);
   }
	void withdraw(double amt)
	{
		balanceamt -= amt ;
		System.out.println("The balace amount is "+balanceamt);
	}
    void display()
    {
    	System.out.println("    "  +hname + "\t    " + accType + "   \t\t " + accNumber +  "  \t     "  + balanceamt  );
    }
}
public class Bank
{   
    public static void main(String a[])
    {   
    	String name;
        String accNumber;
    	String accType ;
    	double balanceamt ;
    	short option ;
    	Bankdetail obj[] = new Bankdetail[10];
    	Scanner scan = new Scanner(System.in);
    	 System.out.println("         Demonstration of constructor and this keyword ");
   	     System.out.println("******************************************************************** ");
   	     System.out.println("Shailesh kumar         section -I         roll no- 50 ");
   	     System.out.println("******************************************************************** ");
    	int i = 0 ;
    	while(true)
    	{
    	 System.out.println("\nChoose the option :  ");
    	 System.out.print("1.Create the Account \n2.To Deposit money \n3.To Withdraw Money \n4.To Displayaccount detail \n5.to Exit\nEnter the option : ");
    	option = scan.nextShort();
    	switch(option)
    	{
    	case 1:  System.out.print("Enter the Account holder name :  ");
 	             name = scan.next();
 	             System.out.print("Enter the Account NUmber  :  ");
 	             accNumber = scan.next();
 	             System.out.print("Choose the Account type name : ");
 	             accType = scan.next();
 	             System.out.print("Enter the Account Balace amount :  ");
 	             balanceamt= scan.nextDouble();
 	             obj[i] = new Bankdetail(name,accNumber,accType,balanceamt);
 	             i++;
 	             break ;
    	case 2 : System.out.println("Enter the account number to deposit money : ");
 	              String account = scan.next();   
 	             int j ;
 	             for( j = 0 ; j< i ; j++) 
 	             if(obj[j].accNumber.equals(account))
 	             { 	System.out.print("Enter the Amount to deposit  in account : ");
 	     	        double amount = scan.nextDouble();	
 	            	 obj[j].deposit(amount);
                 }
 	             if(j == i)
 	             System.out.println("Invalid account number \n  ");
  	             break ;
    	case 3 : System.out.println("Enter the account number to deposit money : ");
                 account = scan.next();   
                 double amt ;
                 for( j = 0 ; j< i ; j++) 
                 if(obj[j].accNumber.equals(account))
                  {  System.out.println("The balance amount  is : "+ obj[j].balanceamt);
                     System.out.print("Enter the amount to withdraw : ");
                     amt = scan.nextDouble();
                     if(amt >obj[j].balanceamt)
                    	 System.out.println("Balance amount is Unsufficient .");
                     else
                	    obj[j].withdraw(amt);
                  }
                 if(j == i)
            	 System.out.println("Invalid account number \n");
                 break ; 
        case 4 : System.out.println("The Bank details are :  ");
                 System.out.println("  Holder_name  \t  Account_type \tAccount_number  \tBalance_amt  ");
                 for(int k = 0 ; k < i ; k++)
                 obj[k].display();
                 break ;
       default : return  ;
         }
    }
}
}
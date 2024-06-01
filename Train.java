package practical;
class Ticket
{
     int balance;
     public Ticket()
      {         balance = 1 ;     }
     public synchronized void withdraw(int bal)
      { 
         if(bal > balance)
         { System.out.println("ticket is not sufficient ");
         System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough ticket for book ");
                   return ;}
      balance= balance-bal;
      System.out.println(Thread.currentThread().getName()+" "+ "is complete the booking the ticket");
      }
  }
class BookTicket implements Runnable
   {
     Ticket obj;
     public BookTicket(Ticket a)
     {
       obj = a ;
     }
     public void run()
     {
     obj.withdraw(1);
     
     }
 }
public class Train {
    public static void main(String str[])
    {
    	 System.out.println("         Demonstration of single object MUltithreading  ");
	     System.out.println("******************************************************************** ");
	     System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	     System.out.println("******************************************************************** ");
	     Ticket a1=new Ticket();
	     BookTicket c1=new BookTicket(a1);
	     Thread t1=new Thread(c1,"person 1");
	     Thread t2=new Thread(c1,"person 2");
	     t1.start();
	     t2.start();
    }
}


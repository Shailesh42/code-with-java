package practical;
class Account
{
     int balance;
     public Account()
      {         balance = 1200 ;     }
     public synchronized void withdraw(int bal)
      { 
         if(bal > balance)
         { System.out.println("balance is not sufficient ");
         System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough money for withdraw ");
                   return ;}
      balance= balance-bal;
      System.out.println("Balance remaining:::" + balance);
      System.out.println(Thread.currentThread().getName()+" "+ "is complete the withdraw");
      }
  }
class Amtthread implements Runnable
   {
     Account obj;
     public Amtthread(Account a)
     {
     obj = a;
     }
     public void run()
     {
     obj.withdraw(1000);
     
     }
 }
public class SingleObjThread {
    public static void main(String str[])
    {
    	 System.out.println("         Demonstration of single object MUltithreading  ");
	     System.out.println("******************************************************************** ");
	     System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	     System.out.println("******************************************************************** ");
	     Account a1=new Account();
	     Amtthread c1=new Amtthread(a1);
	     Thread t1=new Thread(c1,"person 1");
	     Thread t2=new Thread(c1,"person 2");
	     t1.start();
	     t2.start();
    }
}


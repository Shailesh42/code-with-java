package practical;
class A extends Thread
{
	public void run() {
		for(int i = 0 ; i< 20 ; i+= 2)
		System.out.println("The even number  : "+i );	
	}
}
class B extends Thread
{
	public void run() {
		for(int i = 1 ; i< 20 ; i+= 2)
		System.out.println("The odd number  : "+i );	
	}
}
public class EvenOddThread {
   public static void main(String str[])
   {
	     System.out.println("         Demonstration of MUltithreading  ");
 	     System.out.println("******************************************************************** ");
 	     System.out.println("Shailesh kumar         section -I         roll no- 50 ");
 	     System.out.println("******************************************************************** ");
 	     A obj1 = new A();
 	     B obj2 = new B();
 	     obj1.start();
 	     obj2.start();
 	     System.out.println("Exit");
   }
}

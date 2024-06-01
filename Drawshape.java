package practical;
import java.util.*;
abstract class  Shape
{
	public abstract void draw(int num);
	public abstract void erase();
}
class Circle extends Shape 
{  int r ;
   public void draw(int num)
   { 
	 r = num; 
	 System.out.println("The Circle has drawn of radius : "+ r);
   }
   public void erase()
   {
	 r = 0 ; 
	 System.out.println("The shape is gone erased .");
   }
}
class Triangle extends Shape
{  int h;
   int s;
   public void draw(int num)
   {
	  s =h = num;  
	  System.out.println("The Triangle  has drawn of side "+  s + " and height "+  h);
   }
   public void erase()
   {
	  h = 0 ; s =0 ; 
	  System.out.println("The shape is gone erased .");
   }
}
class Square extends Shape
{  int s;
   public void draw(int num)
   {
	  s = num ;
	  System.out.println("The Square has drawn of side "+ s);
   }
   public void erase()
   {   
	   s =0 ;
	   System.out.println("The shape is gone erased ."); 
   }
}
public class Drawshape {
  public static void main(String a[])
  {   
	  System.out.println("Demonstration of abstract keyword ");
	  System.out.println("******************************************************************** ");
	  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	  System.out.println("******************************************************************** ");
	  Scanner scan = new Scanner(System.in);
	  while(true)
	  {
	  System.out.print("Choose the card type \n1.Circle\n2.triangle \n3.Square\nEnter the option : ");
	  
	  int n = scan.nextInt();
	  Shape shapetype ;
	 if( n== 1 )
		 shapetype = new Circle();
	 else if (n== 2)
		 shapetype = new Triangle();
	 else if(n==3 )
		 shapetype = new Square();
	 else break ;
	   shapetype.draw(5);
	   shapetype.erase();	 
  } 
	  scan.close();
  }
}


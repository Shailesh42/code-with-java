package practical;
import java.util.*;
public class Reverse {
  public static void main(String a[])
  {   
	  System.out.println("         Demonstration of reverse word of string ");
	  System.out.println("******************************************************************** ");
	  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
	  System.out.println("******************************************************************** ");
	  System.out.print("Enter the string  :   ");
	  Scanner scan = new Scanner(System.in);
	  String str = new String(scan.nextLine()); 
	  String word[] = str.split("\\s");
	  String revstring = " ";
	  for(String w:word)
	  {
		  StringBuilder str1 = new StringBuilder(w);
		  str1.reverse();
		  revstring += str1.toString();
		  revstring += " ";
	  }
	  System.out.println("After reverse each word of string : ");
	  System.out.println(revstring);
     scan.close(); 	
  }
}

package practical;

import java.util.Scanner;

public class DuplicateElementSearch {
	public static void main(String a[])
	  {   
		  System.out.println("         Demonstration of remove duplicate word of string ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
		  System.out.print("Enter the string  :   ");
		  Scanner scan = new Scanner(System.in);
		  StringBuffer  str = new StringBuffer(scan.nextLine());
		  int length = str.length();
		
		  for(int i = 0 ; i < length - 1; i++)
			  for(int j = i +1 ; j  <length ; j++ )
			  {   				  
				  if( str.charAt(i) == str.charAt(j))
				  {
					  str.deleteCharAt(j);
					  length--;
				  }
 			  }
		  System.out.print("After deleted the duplicate letters in string : ");
		  System.out.println(str);
		  scan.close();
	  }
}

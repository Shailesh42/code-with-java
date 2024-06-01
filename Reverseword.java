package practical;

import java.util.Scanner;

public class Reverseword {
	public static void main(String s[]) {
	 System.out.print("Enter the string  :   ");
	  Scanner scan = new Scanner(System.in);
	  String str = new String(scan.nextLine()); 
	  String word[] = str.split("\\s");
	  String revstring = " ";
      for(int i = word.length ;i> 0 ;i--)
	  {
		  revstring +=  word[i-1];
		  revstring += " ";
	  }
	  System.out.println("After reverse each word of string : ");
	  System.out.println(revstring);
    scan.close(); 	
	}
}

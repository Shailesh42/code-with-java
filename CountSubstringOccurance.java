package practical;
import java.util.*;
public class CountSubstringOccurance {
		public static void main(String a[])
		  {   
			  System.out.println("        COUNT THE OCCUTRANCE OF SUBSTRING IN A STRING     ");
			  System.out.println("******************************************************************** ");
			  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
			  System.out.println("******************************************************************** ");
			  System.out.print("Enter the string  :   ");
			  Scanner scan = new Scanner(System.in);
			  StringBuffer  str = new StringBuffer(scan.nextLine());
			  int length = str.length();
			  int count = 0 ; 
			  System.out.print("Enter the substring to find occrance  : ");
			  StringBuffer  substr = new StringBuffer(scan.nextLine());
			  int sublength = substr.length();
			  for(int i = 0 ; i < length ; i++)
			  {   char ch = substr.charAt(0);
				label2 :
				{  if(str.charAt(i)== ch )
				   {  int k = i ;
					  for(int j = 0 ; j < sublength  ; j++)
					  {  if(str.charAt(i) != substr.charAt(j) ||  k >= length)
					          break label2; 
					        k++;
					        j++; 
					  }
					  count++;
					   i = k ;
				  }
				}
			  }
		      System.out.print("The occurance of "+ substr +" in string "+str + " is : " );
			  System.out.println(count);
			  scan.close();
		  }
	}

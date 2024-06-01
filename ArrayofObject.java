package practical;

import java.util.Scanner;

public class ArrayofObject
{   
	String studentname;
    char section;
	String rollno ;
    public static void main(String a[])
    {   
    	
    	 System.out.println("         Demonstration of Array of objects ");
   	     System.out.println("******************************************************************** ");
   	     System.out.println("Shailesh kumar         section -I         roll no- 50 ");
   	     System.out.println("******************************************************************** ");
   	     System.out.print("Enter the number of students : ");
   	     Scanner scan = new Scanner(System.in);
   	     int n = scan.nextInt();
   	     ArrayofObject obj[] = new ArrayofObject[n];
         for(int i = 0 ; i< n; i++)
         { 
        	     obj[i] = new  ArrayofObject();
                 System.out.println("Enter the details for "+ (i+1)+ "object");
 	             System.out.print("Enter the Name  :  ");
 	             obj[i].studentname = scan.next();
 	             System.out.print("Enter the section : ");
 	             obj[i].section = scan.next().charAt(0);
 	             System.out.print("Enter the roll no  :  ");
 	             obj[i].rollno = scan.next();
         }
         System.out.println("The details are : ");
         System.out.println(" Student_name  \t Section\tRoll_no  ");
         for(int i = 0 ; i< n ; i++)
         System.out.println("  "+  obj[i].studentname  + "  \t  "+ obj[i].section  +  " \t      "+ obj[i].rollno );
         scan.close();
    }
    
}

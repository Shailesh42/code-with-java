package practical;
import java.util.*;
public class Matrix {
   public static void main(String a[])
   {   

		  System.out.println("Demonstration of multidimentonal array ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
	   int array[][]= new int[4][4];
	   Scanner scan = new Scanner(System.in);
	   for(int i = 0 ; i< 4 ; i++)
	   {
		   for(int j = 0 ; j< 4 ; j++)
		   {
			   System.out.print("Enter the quarter" +(j+1)+"of salesman"+(i+1)+ " value :  ");
			   array[i][j]= scan.nextInt();
		   }
	   }
	   System.out.print("\t");
	   for(int j = 0 ; j< 4 ; j++)
	   {
		   System.out.print("\tQuarter"+(j+1)+"  ");
	   }
	   System.out.println("\tTotal");
	   int total = 0 ;
	   int tol[] = new int[4];
	   for(int i = 0 ; i< 4 ; i++)
	   {  
		   System.out.print("Salesman"+(i+1));
		   for(int j = 0 ; j< 4 ; j++)
		   {
			   System.out.print("\t  "+array[i][j]+"\t");
			   total = total + array[i][j];
			   tol[j]= tol[j] + array[i][j];
		   }
		   System.out.println("\t"+total);
		   total =0 ;
	   }
	   System.out.print("Total");	
	   for(int j = 0 ; j< 4 ; j++)
	   {
		   System.out.print("\t \t"+tol[j]+" ");
	   }
	   scan.close();
   }
}

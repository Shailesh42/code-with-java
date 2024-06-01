package practical;
import java.util.*;

public class Temprature {	
	   public static void main(String a[])
	   {   

			  System.out.println("Demonstration of multidimentonal array ");
			  System.out.println("******************************************************************** ");
			  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
			  System.out.println("******************************************************************** ");
		   int array[][]= new int[10][5];
		   String city[]= {"Delhi","Mumbai","Kolkatta","Cheenai","Dehradun"};
		   Scanner scan = new Scanner(System.in);
		   for(int i = 0 ; i< 10 ; i++)
		   {  System.out.print("Enter the temprature of day"+ (i+1)+" in DELHI ,MUMBAI ,KOLKATTA ,CHEENAI ,DEHRADUN respectly  ");
			   for(int j = 0 ; j< 5 ; j++)
			   {
				   
				   array[i][j]= scan.nextInt();
			   }
		   }
		   System.out.print("\t");
		   for(int j = 0 ; j< 5; j++)
		   {
			   System.out.print("\t"+city[j]+"\t");
		   }
		   for(int i = 0 ; i< 10; i++)
		   {  System.out.print("\nDay"+(i+1)+"\t");
			   for( int j = 0 ; j< 5 ; j++)
			   {   
				   System.out.print("\t  "+array[i][j]+"\t");
			   }
			   System.out.println();
		   }
		   scan.close();
	   }
}
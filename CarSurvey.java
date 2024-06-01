package practical;
import java.util.*;
public class CarSurvey {
   public static void main(String a[])
   {   

		  System.out.println("Demonstration of multidimentonal array ");
		  System.out.println("******************************************************************** ");
		  System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		  System.out.println("******************************************************************** ");
	   int array[][]= new int[4][4];
	   String car[]= {"Maruti-K10","Zen-Astelo"," Wagnor" ,"Maruti-SX4"};
	   String city[]= {"Delhi","Mumbai","Cheenai","Kolkatta"};
	   Scanner scan = new Scanner(System.in);
	   for(int i = 0 ; i< 4 ; i++)
	   {
		   for(int j = 0 ; j< 4 ; j++)
		   {
			   System.out.print("Enter the no of "+ car[j] +"in "+ city[i]+ ": ");
			   array[i][j]= scan.nextInt();
		   }
	   }
	   System.out.print("\t");
	   for(int j = 0 ; j< 4 ; j++)
	   {
		   System.out.print("\t"+car[j]+"\t");
	   }
	   System.out.println("Total");
	   int total = 0 ;
	   for(int i = 0 ; i< 4 ; i++)
	   {  
		   System.out.println(city[i]+"\t");
		   for(int j = 0 ; j< 4 ; j++)
		   {
			   System.out.print("\t\t"+array[i][j]+"\t");
			   total = total + array[i][j];
		   }
		   System.out.println(total);
		   total =0 ;
	   }
	   scan.close();
   }
}

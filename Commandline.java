package practical;

public class Commandline {
	public static void main(String[] args) {
		System.out.println("Demonstration of command line exception ");
		System.out.println("******************************************************************** ");
		System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		System.out.println("******************************************************************** ");
		int sum = 0 ; 
		int size = args.length;
		for(int i = 0 ; i< size ; i++)
		try
		{ 
			int n  = Integer.parseInt(args[i]);
			sum += n ;
		}
		catch(Exception e)
		{
			System.out.println("Invalid integer found ");
		}
		System.out.println("Total sum of integer is "+ sum);
		System.out.println("Program completed  ");
	}
}

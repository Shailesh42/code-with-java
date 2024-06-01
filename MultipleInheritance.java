package practical;
class Student
{
int rollnumber;
void getNumber(int n)
{    rollnumber = n;
}
void displayNumber( )
{    System.out.println(" Roll No. :" + rollnumber);
}  } 
class Mark extends Student
{
int part1,part2;
void getMarks(int x, int y)
{
part1 =x;
part2 = y;
}
void displayMarks( )
{
System.out.println("Marks Obtained ");
System.out.println("subject 1 = " + part1);
System.out.println("subject 2 = " + part2);
}
}
interface Sports
{
float SPORT = 0.6F;
void displayWt( );
}
class Result extends Mark implements Sports
{
float total;
public void displayWt( )
{
System.out.println(" Sport Weightage = " + SPORT);
}
void display( )
{
total = part1 + part2 + SPORT;
displayNumber( );
displayMarks( );
displayWt( );
System.out.println("Total mark = " + total);
}
}
public class MultipleInheritance {
	public static void main(String args[])
	{
		System.out.println("Demonstration of MUultiple inheritence using interface ");
		System.out.println("******************************************************************** ");
		System.out.println("Shailesh kumar         section -I         roll no- 50 ");
		System.out.println("******************************************************************** ");
	Result student1 = new Result( );
	student1.getNumber(1234);
	student1.getMarks(27, 33);
	student1.display( );
	}

}

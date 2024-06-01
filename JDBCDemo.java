package jdbc;
import java.sql.*;
import java.util.*;
import java.lang.*;		
public class JDBCDemo  
{
     Connection con = null;
     Statement stmt = null ;
     JDBCDemo() throws ClassNotFoundException , SQLException 
     {
    	 Scanner sc = new Scanner (System.in);
 		Class.forName("com.mysql.cj.jdbc.Driver");
 		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase" , "root","");
 		System.out.println("Enter Department number");
 		stmt=con.createStatement();
 		int vardno = sc.nextInt();
 		ResultSet rs = stmt.executeQuery("Select * from academic where rollno = " + vardno);
 		System.out.println("Below is the list of employee working in deptt No." + vardno);
    	 System.out.println("studentrollno \t studentname \t studentprogram \t studentbranch\n");
    	 while(rs.next())
    	 {
    		System.out.println(rs.getInt("rollno")+ "      \t");
    		System.out.println(rs.getString("name")+ "      \t");
    		System.out.println(rs.getString("program")+ "      \t");
    		System.out.println(rs.getString("branch")+ "      \t");
    	 }
    	 con.close();
    	 sc.close();
    	 
     }
     public static void main(String str[]) throws ClassNotFoundException , SQLException
     {
    	 try {
    		 new JDBCDemo();
    		 
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     
}

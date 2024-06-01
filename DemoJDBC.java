  package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoJDBC {
	 public static void main(String str[])throws ClassNotFoundException , SQLException 
	    {    Scanner scan = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase" , "root","");
			PreparedStatement stmt;
			String sql = null ;
			ResultSet rs ;
			while(true)
			{
			System.out.println("1.insert\n2.update\n3.delete\n4.display list\n");
			System.out.println("choose the option :  ");
			int n  = scan.nextInt();
			switch(n)
			{
			case 1 : sql = "insert into academic values(?,?,?,?) ";
				     stmt = con.prepareStatement(sql);
				    System.out.println("Enter the roll no :  ");				    
			        stmt.setInt(1,scan.nextInt());
			        System.out.println("Enter the name :  ");
		         	stmt.setString(2,scan.next());
		         	System.out.println("Enter the program :  ");
			        stmt.setString(3,scan.next());
			        System.out.println("Enter the branch  :  ");
		        	stmt.setString(4,scan.next());
			        int x = stmt.executeUpdate();
			        System.out.println(x+"Record input in the table ");
					sql = "select * from academic ";
					 rs = stmt.executeQuery(sql);
					break;
			case 2 : sql = "UPDATE academic set  name=? where rollno=?";
			         stmt = con.prepareStatement(sql);
			         System.out.print("Enter the roll no to change name : ");
			         int a = scan.nextInt();
			         stmt.setInt(2,a);
			         System.out.print("Enter the new name to update : ");
			         String b =  scan.next();
			         stmt.setString(1,b);
			         int rows = stmt.executeUpdate();
			         System.out.println("rows impacted : "+ rows);
			         sql = "Select * from academic ";
			         rs = stmt.executeQuery(sql);
			         break ;
			case 3 : sql = "DELETE from academic WHERE rollno=? and name =?";
			          stmt = con.prepareStatement(sql);
			         System.out.println("Enter the rollno and name to delete  : ");
			         int y = scan.nextInt();
			         String t =scan.next();
			         stmt.setString(2,t);
			         stmt.setInt(1,y);
			          x = stmt.executeUpdate();
			         System.out.println(x+" impacted ");
			         sql= "select * from academic ";
			         rs= stmt.executeQuery(sql);
			         break ;
			case 4 :  
				      stmt = con.prepareStatement(sql);
				      rs = stmt.executeQuery(sql);
				      System.out.println("studentrollno \t studentname \t studentprogram \t studentbranch\n");
	    	          while(rs.next())
	                	 {
	    	             	System.out.print(rs.getInt("rollno")+ "      \t");
	    		            System.out.print(rs.getString("name")+ "      \t");
	    		            System.out.print(rs.getString("program")+ "      \t");
	    		            System.out.print(rs.getString("branch")+ "      \t\n");
	    	             }	    	          		         
			}
			}
	 }	
}

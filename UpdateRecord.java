package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {
	 
	 public static void main(String str[])throws ClassNotFoundException , SQLException 
	    {    Scanner scan = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase" , "root","");
			String sql = "UPDATE academic set  name=? where rollno=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			System.out.print("Enter the roll no to change name : ");
			int a = scan.nextInt();
			stmt.setInt(2,a);
			System.out.print("Enter the new name to update : ");
			String b =  scan.next();
			stmt.setString(1,b);
			int rows = stmt.executeUpdate();
			System.out.println("rows impacted : "+ rows);
			sql = "Select * from academic ";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("studentrollno \t studentname \t studentprogram \t studentbranch\n");
	    	 while(rs.next())
	    	 {
	    		System.out.print(rs.getInt("rollno")+ "      \t");
	    		System.out.print(rs.getString("name")+ "      \t");
	    		System.out.print(rs.getString("program")+ "      \t");
	    		System.out.println(rs.getString("branch")+ "      \t");
	    	 }
	    	 con.close();
			scan.close();
}
}
package jdbc;
import  java.sql.*;
//import java.util.Scanner;
public class InsertRecord {
    public static void main(String str[])throws ClassNotFoundException , SQLException 
    { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase" , "root","");
		String sql = "insert into academic values(?,?,?,?) ";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1,4);
		stmt.setString(2,"sourav");
		stmt.setString(3,"oops");
		stmt.setString(4,"b.tech");
		int x = stmt.executeUpdate();
		System.out.println(x+"Record input in the table ");
		sql = "select * from academic ";
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
    	 
		
    }
}

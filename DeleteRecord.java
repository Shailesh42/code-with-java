package jdbc;
import  java.sql.*;
import java.util.Scanner;
//import java.util.Scanner;
public class DeleteRecord {
    public static void main(String str[])throws ClassNotFoundException , SQLException 
    {  
    	 Scanner scan = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase" , "root","");
		String sql = "DELETE from academic WHERE rollno=? and name =?";
		PreparedStatement stmt = con.prepareStatement(sql);
		System.out.println("Enter the rollno and name to delete  : ");
		int a = scan.nextInt();
		String n =scan.next();
		stmt.setString(2,n);
		stmt.setInt(1,a);
		int x = stmt.executeUpdate();
		System.out.println(x+" impacted ");
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
    	 
		scan.close();
    }
}

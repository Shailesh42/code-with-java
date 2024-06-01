package jdbc;
import java.sql.*;
import java.util.Scanner;
public class employ {
	 public static void main(String str[])throws ClassNotFoundException , SQLException 
	    {    Scanner scan = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ" , "root","");
			String   sql = "insert into department values(?,?,?,?) "  ;
			PreparedStatement stmt ;
			ResultSet  rs = null;
			System.out.println("Enter the no of employ to insert detail : ");
			int n = scan.nextInt();
			for(int i = 0 ; i< n ; i++)
			{  
			    stmt =  con.prepareStatement(sql);
			    System.out.print("Enter the empcode :  ");				    
		        stmt.setInt(1,scan.nextInt());
		        System.out.print("Enter the name :  ");
	         	stmt.setString(2,scan.next());
	         	System.out.print("Enter the department :  ");
		        stmt.setString(3,scan.next());
		        System.out.print("Enter the no  :  ");
	        	stmt.setInt(4,scan.nextInt());
		        int x = stmt.executeUpdate();
				sql = "select * from department ";
				 rs = stmt.executeQuery(sql);
			}
			 System.out.println("empcode \t name \t department \t number");
	    	 while(rs.next())
	    	 {
	    		System.out.print(rs.getInt("empcode")+ "      \t");
	    		System.out.print(rs.getString("name")+ "      \t");
	    		System.out.print(rs.getString("department")+ "      \t");
	    		System.out.println(rs.getInt("no")+ "      \t");
	    	 }
	    	 con.close();
	    	 scan.close();
	    	 
	    }
}

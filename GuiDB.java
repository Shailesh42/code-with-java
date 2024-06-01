package gui;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class GuiDB extends Frame  implements ActionListener {
	Panel p1 ,p2 ;
	Label l1 , l2 ,l3;
	Button b1,b2,b3,b4;
	TextField t1,t2,t3,t4 ;
	GuiDB()throws ClassNotFoundException, SQLException
	{   
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ" , "root","");
		 Statement stmt = con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from department"); 
		 FlowLayout l1 = new FlowLayout();
		 setLayout(l1);
		 setSize(400,300);
		add(new Label("Name : Shailesh kumar    section:I    roll no : 50"),"NORTH");
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,2));
		t1 = new TextField(20);   t1.setEditable(false);
		t2 = new TextField(20);   t2.setEditable(false);
		t3 = new TextField(20);   t3.setEditable(false);
		t4 = new TextField(20);   t4.setEditable(false);
		p1.add(new Label("empcode"));     p1.add(t1);
		p1.add(new Label("name"));        p1.add(t2);
		p1.add(new Label("Department"));  p1.add(t3);
		p1.add(new Label("no"));          p1.add(t4);
		add(p1,"CENTER");
		p2 = new Panel();
		p2.setLayout(new GridLayout(1,4));
		b1 = new Button("first");
		b2 = new Button("previous");
		b3 = new Button("next");
		b4 = new Button("last");
		b1.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
				 try {  stmt.setMaxRows(1);
						t1.setText(rs.getInt("empcode")+" ");
						t2.setText(rs.getString("name")+" ");
						t3.setText(rs.getString("department")+" ");
						t4.setText(rs.getInt("no")+" ");
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}    
		}});
		b1.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
		             
		}});
		b1.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){  
		             
		}});
		
		p2.add(b1); p2.add(b2); p2.add(b3);  p2.add(b4);
		add(p2,"SOUTH");
		
		setVisible(true);

    	addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
	}
   public static void main(String str[]) throws ClassNotFoundException, SQLException
   {
	   new GuiDB();
	  
	   
   }
public void actionPerformed(ActionEvent e) {
	
	
}
}

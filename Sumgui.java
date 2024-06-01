package gui;
import java.awt.*;
import java.awt.event.*;
public class Sumgui extends Frame implements ActionListener
{
	   Label  lblcount;
	   TextField tfnum1 , tfnum2 ,tfcount;
	   Button btncount ;
	   int count = 0  ;
	   public Sumgui()
	   {
			FlowLayout  f1 = new FlowLayout()  ;
			setLayout(f1);
			setTitle("AWt sum ");
			setSize(300,200);
			
			lblcount = new Label("Counter");
			add(lblcount);
			
			tfnum1 = new TextField(10);
			tfnum1.setEditable(true);		
			add(tfnum1);
			
			tfnum2 = new TextField( 10);
			tfnum2.setEditable(true);			
			add(tfnum2);				
			
			btncount = new Button("sum");
			add(btncount);
			btncount.addActionListener(this);
			
			tfcount = new TextField(10);
			tfcount.setEditable(false);
			add(tfcount);
			
			setVisible(true);
			
			 addWindowListener (new WindowAdapter() {    
		            public void windowClosing (WindowEvent e) {    
		                dispose();    
		            }    
		        });   
	
}
public static void main(String[] args) {
		new Sumgui();
		
	}

public void actionPerformed(ActionEvent e) {
		 int a = Integer.parseInt(tfnum1.getText());
		 int b = Integer.parseInt(tfnum2.getText());
         int sum = a+b ;
          tfcount.setText(sum+" ");
      	}
}
package gui;
import java.awt.* ;
import java.awt.event.*;
public class AwtCounter extends Frame implements ActionListener
{
   Label  lblcount;
   TextField tfcount;
   Button btncount ;
   Panel p1;
   int count = 0 ;
    public  AwtCounter(){
	FlowLayout  f1 = new FlowLayout()  ;
	setLayout(f1);
	setTitle("AWt counter");
	setSize(500,400);
	
	lblcount = new Label("Counter");
	add(lblcount);
	
	tfcount = new TextField("0", 10);
	tfcount.setEditable(false);
	add(tfcount);
	
	btncount = new Button("count");
	add(btncount);
	btncount.addActionListener(this);
	setVisible(true);
	
	addWindowListener (new WindowAdapter() {    
        public void windowClosing (WindowEvent e) {    
            dispose();    
        }    
    });  
	
}
    
    	public static void main(String str[] )
    	{
    		AwtCounter app = new AwtCounter();
    	}

		public void actionPerformed(ActionEvent e) {
		++count ;
		tfcount.setText(count +" ");
		}
    
   
}

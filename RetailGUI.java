package gui;

import java.awt.*;
import java.awt.event.*;

public class RetailGUI extends Frame implements ActionListener , ItemListener {
	Button btn ;
	Label lbl,lbl1 ;
	TextField txt, txt2;
	Checkbox  checkBox1, checkBox2 , checkbox3 ;
	int unit ;
	Panel p1,p2 , p3 ;
	double cost;
    public RetailGUI () {
    	FlowLayout  f1 = new FlowLayout()  ;
		setLayout(f1);
		setTitle("Brillent Packaging Company ");
		setSize(600,400);
		p1 = new Panel();
    	p1.setLayout(new GridLayout(3,1));
    	lbl = new Label("Unit ordered ");
    	p1.add(lbl);
    	
    	txt = new TextField(20);
    	txt.setEditable(true);	
    	
    	p1.add(txt );
    	p2 = new Panel();
    	p2.setLayout(new GridLayout(3,1));
    	lbl1 = new Label("custmer type ");
    	p2.add(lbl1);
    	CheckboxGroup cbg = new CheckboxGroup();  
         checkBox1 = new Checkbox("Whole sailer", cbg, true);        
         checkBox2 = new Checkbox("retailer", cbg, false); 
        checkBox1.addItemListener(this);    
        checkBox2.addItemListener(this);    
        
         checkbox3 = new Checkbox("specialdiscount", false);  
        p2.add(checkBox1);    
        p2.add(checkBox2);    
        p1.add(checkbox3);
        p3 = new Panel();
    	p3.setLayout(new GridLayout(1,3)); 
        btn = new Button("calculate cost ");
        btn.addActionListener(this);
        p3.add(btn); 
    	
    	lbl = new Label("total cost in Rs : ");
    	p3.add(lbl);
    	
    	txt2 = new TextField(20);
    	txt2.setEditable(false);
    	
    	p3.add(txt2);
    	
    	add(p1);
    	add(p2);
    	add(p3);
    	add(new Label("Name : Shailesh kumar    section:I    roll no : 50"));
    	setVisible(true);
    	
    	addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });   
    }
    public static void main(String[] args) {
		new RetailGUI();
		
	} 
    public void calculation()
    {
    	 unit = Integer.parseInt(txt.getText());
   	  if(checkBox1.getState())
   	 {  if(unit <= 15 )
   		 cost = 50 * unit ;
   	 else if(unit <= 20)
   		 cost = 45 * unit ;
   	 else if (unit <= 30)
   		 cost = unit* 40 ;
   	 else if (unit <= 50)
   		 cost = unit* 35 ;
   	 else 
   		 cost = unit* 30;
   	 }
   	if(checkBox2.getState())
   	 { 
   		 if(unit <= 15 )
   		 cost = 60 * unit ;
   	 else if(unit <= 20)
   		 cost = 55 * unit ;
   	 else if (unit <= 30)
   		 cost = unit* 50 ;
   	 else if (unit <= 50)
   		 cost = unit* 45 ;
   	 else 
   		 cost = unit* 40;
   	 }
   	if(checkbox3.getState())
   	 { cost = cost* 0.9 ;
   	 }
   	txt2.setText(cost +"");
    }
public void itemStateChanged(ItemEvent e) {
}
public void actionPerformed(ActionEvent e) {
	calculation(); 
 	}
}


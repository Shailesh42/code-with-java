package practical;
import java.awt.*;
import java.awt.event.*;

public class Capital extends Frame implements ActionListener  {
	List l1 , l2 ;
	Button btn ;
    Label lbl1 ,lbl2 ;
    Panel p1 ;
	Capital(){
	  FlowLayout  f1 = new FlowLayout();
	  setSize(500,300);
	  setTitle("Check country Capital ");
	  setLayout(f1);
    	l1  = new List(10);
    	l1.add("India");
    	l1.add("Australia");
    	l1.add("PAkistan");
    	l1.add("Bangladesh");
    	l1.add("Shrilanka");
    	l1.add("china");
    	l1.add("America");
    	l1.add("Japan");
    	l1.add("Russia");
    	l1.add("Afgainstan");
    	add(l1);
    	l2  = new List(10);
    	l2.add("Maxico");
    	l2.add("Daka");
    	l2.add("Tokyo");
    	l2.add("Canbera");
    	l2.add("Delhi");
    	l2.add("Islamabad");
    	l2.add("kabul");
    	l2.add("Colmbo");
    	l2.add("Kalifornia");
    	l2.add("Beiging");
    	l1.addActionListener(this);
    	l2.addActionListener(this);
       add(l2);
       p1 = new Panel();
      p1.setLayout(new GridLayout(3,1));
       btn = new Button("Check");
       btn.addActionListener(this);
       p1.add(btn);
       lbl1 = new Label("result");
       p1.add(lbl1);
       lbl2 = new Label("Name : Shailesh kumar   Section : I    Roll no : 50");
       p1.add(lbl2);
       add(p1);
       setVisible(true);
	addWindowListener (new WindowAdapter() {    
        public void windowClosing (WindowEvent e) {    
            dispose();    
        }    
	});
    }
	public void actionPerformed(ActionEvent e) {	check();		
}
	void check()
	{
        String str[] = {"Delhi","Canbera", "Islamabad","Daka","Colmbo", "Beiging","Kalifornia","Tokyo","Maxico","kabul"};
		int i = l1.getSelectedIndex();
		if(str[i].equalsIgnoreCase(l2.getSelectedItem()))
		    lbl1.setText("CORRECT ANSWER ");
		else
			lbl1.setText("THE CORRECT ANSWER IS :"+str[i]);
		
	}
 public static void main(String Str[])
 {
	Capital cap =  new Capital();

 }
}


	
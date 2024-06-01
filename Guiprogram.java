package gui;
import java.awt.* ;
class First extends Frame 
{
	First()
	{
		Button b = new Button("Click me ");
		b.setBounds(30 , 500 ,80,30 );
		add(b);
		setSize(300 , 300);
		FlowLayout l = new FlowLayout();
		setLayout(l);
		setVisible(true);
	}
	
}

public class Guiprogram {

	public static void main(String[] args) {
	   First f =new First();
	   
	}

}

package gui;
import java.awt.*;
import java.awt.event.*;
public class Layout extends Frame implements ActionListener,WindowListener
{
    Button fb, gb,bb,flb1,flb,flb2,flb3,flb4,blb1,blb2, blb3,blb4,blb5,gl1,gl2,gl3,gl4;
    Panel sp, bp,fl,bo,gl;
    CardLayout cl;
    Label l1,l2;
    public Layout()
       {
        super("All-in One Layout");
        cl = new CardLayout();
        sp = new Panel();
        sp.setLayout(cl);
        fb = new Button("flow");
        bb = new Button("border");
        gb = new Button("grid");
        bp = new Panel() ;
        fl = new Panel() ;
        bo = new Panel() ;
        gl= new Panel();
        bp.setLayout(new GridLayout(1, 1));
        gl.setLayout(new GridLayout(2, 2));
        fl.setLayout(new FlowLayout());
        bo.setLayout(new BorderLayout(3,3));
        flb1 = new Button("F");          flb2 = new Button("L");
        flb3 = new Button("O");          flb4 = new Button("W");
        blb1 = new Button("NORTH");      blb2 = new Button("EAST");
        blb3 = new Button("CENTER");     blb4 = new Button("WEST");
        blb5 = new Button("SOUTH");      gl1 = new Button("G");
        gl2 = new Button("R");           gl3 = new Button("I");
        gl4 = new Button("D");
        l1 = new Label("NAME :SHAILESH KUMAR  SECTION : I  Roll no: 50");
        l2 = new Label("Demonstrating all layouts in single program");
        fl.add(flb1); fl.add(flb2);fl.add(flb3);fl.add(flb4);
        bo.add(blb2,BorderLayout.EAST);
        bo.add(blb4,BorderLayout.WEST);
        bo.add(blb1,BorderLayout.NORTH);
        bo.add(blb5,BorderLayout.SOUTH);
        bo.add(blb3,BorderLayout.CENTER);
        bo.add(l1,BorderLayout.NORTH);
        bo.add(l2,BorderLayout.CENTER);
        gl.add(gl1); gl.add(gl2); gl.add(gl3); gl.add(gl4);
        fb.addActionListener(this);
        gb.addActionListener(this);
        bb.addActionListener(this);
        bp.add(fb); bp.add(gb); bp.add(bb);
        addWindowListener(this);
        add(sp, "Center");   add(bp, "South"); sp.add(bo, "b"); sp.add(fl, "f"); sp.add(gl,"g");
        setSize(400, 300);
        setVisible(true) ;
}
public void actionPerformed(ActionEvent e)
{
       String str = e.getActionCommand();
       if(str.equals("grid"))
    	   cl.show(sp,"g") ;
       if(str.equals("flow"))
    	   cl.show(sp,"f");
       cl.show(sp,"b");
}
public static void main(String args[])
{  
	new Layout();
}
public void windowActivated(WindowEvent arg0) {}
public void windowClosed(WindowEvent arg0){}
public void windowClosing(WindowEvent arg0)
   {   System.exit(0); }
public void windowDeactivated(WindowEvent arg0){}
public void windowDeiconified(WindowEvent arg0){}
public void windowIconified(WindowEvent arg0){}
public void windowOpened(WindowEvent arg0) {}
}

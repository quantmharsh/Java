package AWT;
import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupEx extends Frame implements  ItemListener  {
    CheckboxGroupEx(String str)
    {
        super(str);
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            };
        });
    }
    Label l1 ,l2;
    TextField tf1;
    Checkbox  cb1,cb2 ,cb3 ;
    CheckboxGroup cbg;
    public void createWindow()
    {
        cbg= new CheckboxGroup();
        l1= new Label("select gender");
        l2 = new Label("gender selected");
        tf1= new TextField(12);
        cb1= new Checkbox("Male",  false ,cbg);
        cb2= new Checkbox("Female",  false ,cbg);
        cb3= new Checkbox("others",  false ,cbg);
        setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);
        setBackground(Color.PINK);
        add(l1);
        add(l2);
        add(cb1);
        add(cb2);
        add(cb3);
        add(tf1);
        
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==cb1);
        {
            tf1.setText("Male");
        }
        if(e.getSource()==cb2)
        {
            tf1.setText("female");

        }
        if(e.getSource()==cb3)
        {
            tf1.setText("LGBTQ");
        }
    }
    public static void main(String[] args) {
        CheckboxGroupEx c= new CheckboxGroupEx(" checkbox group implimentation");
        c.createWindow();
    }

}

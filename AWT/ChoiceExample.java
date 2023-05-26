package AWT;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChoiceExample extends JFrame implements ActionListener {
    ChoiceExample(String str)
    {
        super(str);
    }
    JButton b1 ,b2;
    JCheckBox cb1 ,cb2;
    JComboBox cbox;
    JPanel p1,p2;

    public void createWindow()
    {

        String[] colList={"RED","GREEN","BLUE","GRAY"};
        b1= new JButton("Ok");
        b2= new JButton("Cancel");
        cb1 = new JCheckBox("Background");
        cb2= new JCheckBox("Foreground");
        cbox= new  JComboBox(colList);
        p1= new JPanel();
        p2=new JPanel();
       
        getContentPane().setBackground(Color.yellow);
        setVisible(true);
        setSize(250, 200);
        p1.add(cbox);
        add(cbox);
        add(cb1);
        add(cb2);
        add(b1);
        add(b2);
        setLayout(new FlowLayout());
        add(p1);
    }
    public void actionPerformed(ActionEvent e)
    {

    }
    public static void main(String[] args) {
        ChoiceExample ce = new ChoiceExample("select color");
        ce.createWindow();
    }



    
}

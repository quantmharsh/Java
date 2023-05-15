package AWT;
import java.awt.*;
import java.awt.event.*;

public class addSub extends Frame  implements ActionListener ,ItemListener ,MouseListener ,MouseMotionListener 
  {
    Label num1 ,num2 ,result  ,course , l1 ,l2 ,l3;
    TextField  tf1 ,tf2 ,tf3 ,tf4 ,tf5;
    Button add ,sub;
    Checkbox  checkbox1  ,checkbox2;
    List list1 ;


    addSub(String str)
    {
        super(str);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void createWindow()
    {
      num1 = new Label("enter num1");
      num2 = new Label("enter num2");
      result=new Label("result");
      l1= new Label();
      l2= new Label();
      course = new Label("selected course");
      tf1= new TextField(12);
      tf2= new TextField(12);
      tf3= new TextField(12);
      tf4= new TextField(10);
      tf5= new TextField(12);
      l3= new Label("selected city");
      list1 = new List(4);
      list1.add("varanasi");
      list1.add("mumbai");
      list1.add("delhi");
      list1.add("lucknow");
      list1.add("buxar");
      list1.add("vellore");


       add = new Button("Add");
       sub= new Button("SUB");
       checkbox1 = new Checkbox("MCA", false);
       checkbox2 = new Checkbox("BCA", false);
       

       add.addActionListener(this);
       sub.addActionListener(this);
       checkbox1.addItemListener(this);
       checkbox2.addItemListener(this);
       addMouseListener(this);
       addMouseMotionListener(this);
       //for list
       list1.addMouseListener(this);

     

       setLayout(new FlowLayout());
    //    num1.setBounds(50,  280,  50, 50);
    //    num2.setBounds(50, 100,  50,  50);
    //    tf1.setBounds( 230, 280,  70, 30);
    //    tf2.setBounds( 230,  100, 70, 30);
    //    add.setBounds( 150, 150,  150, 100);
    //    sub.setBounds(150, 100, 150, 100);
    //    result.setBounds(150, 70, 100, 70);
    //    tf3.setBounds(350, 70, 70, 50);
       setVisible(true);
       setSize(600, 500);
       setBackground(Color.PINK);
       add(num1);
       add(tf1);
       add(num2);
       add(tf2);
       add(add);
       add(sub);
       add(tf3);
       add(checkbox1);
       add(checkbox2);
       add(course);
       add(tf4);
       add(l1);
       add(l2);
       add(list1);
       add(l3);
       add(tf5);
     
      




       


    }
    //for checkbox
    public void itemStateChanged( ItemEvent e)
    {
        if(e.getSource()== checkbox1)
        {
        
            tf4.setText( checkbox1.getLabel() +" ");
        }
        if(e.getSource()== checkbox2)
        {
            tf4.setText( checkbox2.getLabel() +" ");
        }
        // if(e.getStateChange()==1)
        // {
        //     tf4.setText( checkbox1.getLabel() +" ");
        // }
        // if(e.getStateChange()==1)
        // {
        //     tf4.setText( tf4.getText()+checkbox2.getLabel());
        // }
       
    }
    //for buttons
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == add)
        {
             int n1 = Integer.parseInt(tf1.getText());
             int n2= Integer.parseInt(tf2.getText());
             int sum= n1+n2;
             tf3.setText(sum+" ");

        }
        if(e.getSource()==sub)
        {
            int n1= Integer.parseInt(tf1.getText());
            int n2= Integer.parseInt(tf2.getText());
            int min= n1-n2;
            tf3.setText((min)+"");

           

        }
    }
    //for mouse 
    public void mouseClicked(MouseEvent e)

    {
     l1.setText("mouse clicked");
     if(e.getSource() ==list1)
     {
        tf5.setText(list1.getItem(list1.getSelectedIndex()));
     }

    }
    public void mouseEntered( MouseEvent e)
    {
        l1.setText("mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l1.setText("mouse exited");
    }
    public void mousePressed(MouseEvent e) {  
        l1.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l1.setText("Mouse Released");  
    } 

    //for mouse motionListener
    public void mouseDragged(MouseEvent e)
    
    {
    }
    public void mouseMoved(MouseEvent e)
    {
      l2.setText("X:"+e.getX()+" ,Y:"+e.getY());
    }

    public static void main(String[] args) {
        addSub a= new addSub(" addition and subtraction using awt");
        a.createWindow();
    }

    
}

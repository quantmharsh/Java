package AWT.LabAssignment3;
import java.util.*;

import abstractInterface.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class NumberConverter extends Frame implements ActionListener {
     NumberConverter(String str)
     {
        super(str);
        addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
              dispose();
          }
      });
     }
     Label Decimal,Hex ,Binary ;
     TextField decimalField ,hexField ,BinaryField;
      public void createWindow()
      {
        Decimal = new Label("Decimal");
        Hex = new Label("Hex");
        Binary= new Label("Binary");
        decimalField= new TextField(12);
        hexField=new TextField(12);
        BinaryField = new TextField(12);
        setLayout(new GridLayout(3, 3 , 0,0));
        setVisible(true);
        setSize(300, 100);
        setBackground(Color.pink);
        add(Decimal);
        add(decimalField);
        add(Hex);
        add(hexField);
        add(Binary);
        add(BinaryField);
        decimalField.addActionListener(this);
        hexField.addActionListener(this);
        BinaryField.addActionListener(this);


      }
     public  void  actionPerformed( ActionEvent e)
      {
    if(e.getSource()==decimalField)
    {
        int num = Integer.parseInt(decimalField.getText());
        String  hexvalue=Integer.toHexString(num);
        String binaryvalue= Integer.toBinaryString(num);
        hexField.setText(hexvalue);
        BinaryField.setText(binaryvalue);
    }
    if(e.getSource()== hexField)
    {
         String  num = hexField.getText();
         int decimalvalue= Integer.parseInt(num ,16);
        String binaryvalue= Integer.toBinaryString(decimalvalue);
        decimalField.setText(decimalvalue+"");
        BinaryField.setText(binaryvalue);

    }
    if(e.getSource()==BinaryField)
    {
        String num = BinaryField.getText();
        int  decimalvalue= Integer.parseInt(num ,2);
        String hexvalue= Integer.toHexString(decimalvalue);
        decimalField.setText(decimalvalue+"");
        hexField.setText(hexvalue);
        }
      }
     public static void main(String[] args) {
         NumberConverter nc= new NumberConverter(" NUMBER CONVERTER");
         nc.createWindow();
     }

    
    
}

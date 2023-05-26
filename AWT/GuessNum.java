package AWT;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GuessNum extends JFrame implements ActionListener {

    int randNum;
   
    GuessNum(String str)
    {
        super(str);
        randNum = new Random().nextInt(0, 10);
        System.out.println(randNum);
    }
    JLabel l1;
    JTextField  tf1 ; 
    JButton b1;
    public void createWindow()
    {
        l1= new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        tf1 = new JTextField(12);
        b1= new JButton("Guess!");
        add(l1);
        add(tf1);
        add(b1);
      
        setVisible(true);
      
        setLayout(new FlowLayout());
        setSize(300,150);
        b1.addActionListener(this);
        // tf1.addKeyListener(new KeyAdapter() {
        //     public void keyReleased(KeyEvent k){
        //         String guessedNum = tf1.getText();
        //         if (guessedNum.length() == 0) return;
        //         int num = Integer.parseInt(guessedNum);
        //         checkNum(num);
        //     }
        // });
        tf1.addKeyListener(  new KeyAdapter()
        {
            public void keyReleased(KeyEvent e)
            {
                 int guessedNum = Integer.parseInt(tf1.getText());
                 if(guessedNum==0)return;
                 checkNum(guessedNum);
            }
        });
 
    }
    public void checkNum(int guessedNum)
    {
        if(randNum==guessedNum)
        {
            getContentPane().setBackground(Color.GREEN);
            l1.setText("CORRECT GUESS!!");
            tf1.setEditable(false);

        }
        if(randNum <guessedNum)
        {
            getContentPane().setBackground(Color.RED);
            l1.setText("TOO  High");

        }
        if(randNum >guessedNum)
        {
            getContentPane().setBackground(Color.BLUE);
            l1.setText("TOO LOW");
        }

    }
    // public  int generateRandom()
    // {
    //     Random rand = new Random();
    //     int randNum = rand.nextInt(0,1001);
    //     return randNum;
    // }
    public void actionPerformed(ActionEvent e)
    {
        // for resetting the game
        // 1. generate new random number
        // 2. clear tex
        if(e.getSource()==b1)
        {

        tf1.setEditable(true);
        randNum =new Random().nextInt(0,11);
        System.out.println(randNum);
        getContentPane().setBackground(Color.GRAY);
        }


    }
    public static void main(String[] args) {
        
        GuessNum gn= new GuessNum("Lets play!");
        gn.createWindow();
    }

    
    
}



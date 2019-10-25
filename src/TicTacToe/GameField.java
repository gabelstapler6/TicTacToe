package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameField extends JButton implements ActionListener{
    public static int buttonsize = 100;
    private int clickCounter;

    public GameField( window w){
       setSize(buttonsize, buttonsize);
        w.getContentPane().add(this);
        addActionListener(this);
    }

    public void play(int counter){
        clickCounter = counter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(clickCounter % 2){
            case 0: this.setText("X");
            break;
            case 1: this.setText("O");
            break;
        }
    }
    
}
package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TTTView extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 4567822880145248471L;

    private TTTButton[] buttons = new TTTButton[9];

    public TTTView(){
        this.setTitle("TicTacToe");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createTTTButton(150);
    }

    public void createTTTButton(int buttonsize) {
        
        this.setLayout(new GridLayout(3,3));
        int c = 0;

        for(int i=0; i < 9; i++){
            buttons[i] = new TTTButton(c);
            this.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, buttonsize/3));
            c++;
        }
        
        this.setSize(buttonsize*3, buttonsize*3);
        this.setVisible(true);
    }

    public void setButtonText(int num, String txt){
        buttons[num].setText(txt);
        buttons[num].setEnabled(false);
    }

    public void setButtonListener(ActionListener listener){
        for(int i = 0; i < 9; i++){
            buttons[i].addActionListener(listener);
        }
    }

    public void endGame(){
        for(int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }
    }

}
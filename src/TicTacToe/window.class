package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class window extends JFrame implements ActionListener {
    private static int buttonsize = 150;
    private GameField[][] buttons = new GameField[3][3];

    public window(){
        setTitle("TicTacToe");
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        playTicTacToe();
    }

    public void createGameField() {
        
        for(int z=0; z < 3; z++){
            for(int i = 0; i < 3; i++){
                buttons[i][z] = new GameField(this);
            }
        }
        setSize(buttonsize*3, buttonsize*3);
        setVisible(true); 
    }

    public void playTicTacToe() {
        createGameField();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }

}
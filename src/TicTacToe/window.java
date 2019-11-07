package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class window extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 4567822880145248471L;
    private GameField[][] buttons = new GameField[3][3];
    private Player PlayerOne = new Player("andi");
    private Player PlayerTwo = new Player("mascha");

    public window(){
    }

    public void createGameField(int buttonsize) {

        setTitle("TicTacToe");
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        int n = 0;
        for(int z=0; z < 3; z++){
            for(int i = 0; i < 3; i++){
                buttons[i][z] = new GameField( this, n, PlayerOne, PlayerTwo );
                buttons[i][z].setFont(new Font("Arial", Font.PLAIN, buttonsize/3));
                n++;
            }
        }
        setSize(buttonsize*3, buttonsize*3);
        setVisible(true); 
    }

    public void endGame(){
        for(int z=0; z < 3; z++){
            for(int i = 0; i < 3; i++){
                buttons[i][z].setEnabled(false);
            }
        }
    }

    public void playTicTacToe(int buttonSize) {
        createGameField(buttonSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }

}
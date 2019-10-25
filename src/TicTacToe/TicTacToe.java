package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttonArr = new JButton[3][3];
    private int buttonsize = 100;

    private int[][] player1Checker = new int[3][3];
    private int[][] player2Checker = new int[3][3];

    public TicTacToe() {
        createWindow();
        createButtons();
        //play();
    }

    public void createWindow(){
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new GridLayout(3,3));

    }

    public void createButtons() {
        for(int z=0; z<3;z++){
            for(int i = 0; i < 3; i++){
                buttonArr[i][z] = new JButton();
                buttonArr[i][z].setSize(buttonsize, buttonsize);
                buttonArr[i][z].setBackground(Color.GRAY);
                panel.add(buttonArr[i][z]);
            }
        }
        frame.getContentPane().add(panel);
        frame.setSize(buttonsize*3, buttonsize*3);
        frame.setVisible(true);
    }

    public void play() {
        int state = 0;
        while(state < 9){
            for(int z = 0; z < 3; z++){
                for(int i = 0; i < 3; i++){
                    if(buttonArr[i][z].isSelected()){
                        switch(state % 2){
                            case 0: buttonArr[i][z].setText("X");
                            break;
                            case 1: buttonArr[i][z].setText("O");
                            break;
                        }
                        state++;
                    }
                }
            }
        }     
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}


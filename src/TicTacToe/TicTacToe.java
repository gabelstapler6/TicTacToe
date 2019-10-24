package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    private JFrame frame;
    private JPanel panel;
    private JToggleButton[][] buttonArr = new JToggleButton[3][3];
    private int buttonsize = 100;

    public TicTacToe() {
        createWindow();
        createButtons();   
    }

    public void createWindow(){
        frame = new JFrame("TicTacToe");
        frame.setSize(540, 540);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
    }

public void createButtons() {

        int x = 100, y = 100;

        for(int z=0; z<3;z++){
            for(int i = 0; i < 3; i++){
                buttonArr[i][z] = new JToggleButton();
                buttonArr[i][z].setBounds(x, y, buttonsize, buttonsize);
                buttonArr[i][z].setBackground(Color.GRAY);
                panel.add(buttonArr[i][z]);
                x += buttonsize + 10;
            }
            y += buttonsize + 10;
            x = 100;
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}


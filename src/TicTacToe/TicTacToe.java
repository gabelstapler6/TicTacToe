package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    private JFrame frame;
    private JPanel panel;

    public TicTacToe() {
        createWindow();    
    }

    public void createWindow(){
        frame = new JFrame("TicTacToe");
        frame.setSize(1024, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.lightGray);

        frame.add(panel);
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}


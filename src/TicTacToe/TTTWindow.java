package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TTTWindow extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 4567822880145248471L;
    private JButton[][] buttons = new JButton[3][3];
    private Controller[][] controller = new Controller[3][3];

    public TTTWindow(){
        setTitle("TicTacToe");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createTTTButton(150);
    }

    public void createTTTButton(int buttonsize) {
        
        setLayout(new GridLayout(3,3));
        
        for(int z=0; z < 3; z++){
            for(int i = 0; i < 3; i++){
                buttons[i][z] = new JButton();
                buttons[i][z].add(this);
                buttons[i][z].setFont(new Font("Arial", Font.PLAIN, buttonsize/3));
                controller[i][z].setButton(buttons[i][z]);
                buttons[i][z].addActionListener(controller[i][z]);
            }
        }
        

        setSize(buttonsize*3, buttonsize*3);
        setVisible(true);
    }
    

}
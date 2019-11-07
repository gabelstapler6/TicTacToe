package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameField extends JButton implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = -9211113845223648673L;
    private static int clickCounter = 0;
    private static Player playerOne;
    private static Player playerTwo;
    private int buttonNbr;

    public GameField(window w, int nbr, Player P1, Player P2){
        buttonNbr = nbr;
        w.getContentPane().add(this);
        addActionListener(this);
        playerOne = P1;
        playerTwo = P2;
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = clickCounter % 2;

        switch(value){
            case 0:
            this.setText("X");
            this.setEnabled(false);
            playerOne.setPlayerClicks(buttonNbr);
            if(clickCounter >= 4)
                playerOne.checkWin();
            break;
            case 1:
            this.setText("O");
            this.setEnabled(false);
            playerTwo.setPlayerClicks(buttonNbr);
            if(clickCounter > 4)
                playerTwo.checkWin();
            break;
        }
        clickCounter++;
    }
    
}
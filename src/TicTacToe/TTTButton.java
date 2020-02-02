package TicTacToe;

import javax.swing.*;
import java.awt.event.*;


public class TTTButton extends JButton{
    /**
     *
     */
    private static final long serialVersionUID = -9211113845223648673L;
   
    private int buttonNbr;
    

    public TTTButton(int nbr){
        buttonNbr = nbr;
    }

    public int getButtonNbr() {
        return buttonNbr;
    }

}
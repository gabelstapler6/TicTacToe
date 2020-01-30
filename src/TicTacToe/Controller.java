package TicTacToe;


import java.awt.event.*;
import javax.swing.*;

public class Controller implements ActionListener{
    private JButton button;

    public Controller(){
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
        button.setText("X");
        
    }
    
}
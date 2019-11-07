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
    private Player PlayerOne;
    private Player PlayerTwo;

    public window(){
        setTitle("TicTacToe");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createGameField(int buttonsize) {
        
        setLayout(new GridLayout(3,3));
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

    public void playTicTacToe() {
        this.setSize(400,200);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel player1 = new JLabel("Player1 Name");
        JLabel player2 = new JLabel("Player2 Name");
        JLabel size = new JLabel("Size of Game Field");
        JTextField fieldSize = new JTextField();
        JTextField name1 = new JTextField();
        JTextField name2 = new JTextField();
        JButton confirm = new JButton("confirm");
        panel.add(size);
        panel.add(fieldSize);
        panel.add(player1);
        panel.add(name1);
        panel.add(player2);
        panel.add(name2);
        panel.add(confirm);
        this.add(panel);
        this.setVisible(true);
        confirm.addActionListener(new ActionListener(){
            String nameOne, nameTwo;
            int s;
            @Override
            public void actionPerformed(ActionEvent e) {
                s = Integer.parseInt(fieldSize.getText());
                PlayerOne = new Player(name1.getText());
                PlayerTwo = new Player(name2.getText());
                if(s > 50){
                    remove(panel);
                    createGameField(s);
                }else{
                    JLabel warning = new JLabel("Size too low, enter another");
                    panel.add(warning);
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }

}
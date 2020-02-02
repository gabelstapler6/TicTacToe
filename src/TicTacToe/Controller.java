package TicTacToe;


import java.awt.event.*;

public class Controller{
    private TTTView view;
    private Model model;

    private int[] checkForWin1;
    private int[] checkForWin2;
    private int clickCounter;
    

    public Controller(TTTView view, Model model){
        this.model = model;
        this.view = view;
        checkForWin1 = new int[9];
        checkForWin2 = new int[9];

        this.view.setButtonListener(new TTTbuttonListener());
    }
    
    class TTTbuttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clickCounter++;
    
            if(clickCounter % 2 == 1) {
                view.setButtonText(((TTTButton)e.getSource()).getButtonNbr(), "X");
                checkForWin1[((TTTButton)e.getSource()).getButtonNbr()] = 1;
            }else{
                view.setButtonText(((TTTButton)e.getSource()).getButtonNbr(), "O");
                checkForWin2[((TTTButton)e.getSource()).getButtonNbr()] = 1;
            }
            
            if(clickCounter > 4){
                if(model.checkWin(checkForWin1)){
                    view.endGame();
                }
                if(model.checkWin(checkForWin2)){
                    view.endGame();
                }
            }
        }

    }
    
}
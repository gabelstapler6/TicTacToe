package TicTacToe;

/**
 * Model
 */
public class TTTModel {

    
    public boolean checkWin(int[] checkForWin){

        if(checkForWin[0] == 1){
            if(checkForWin[1] == 1 && checkForWin[2] == 1){
                return true;
            }
            if(checkForWin[4] == 1 && checkForWin[8] == 1){
                return true;
            }
            if(checkForWin[3] == 1 && checkForWin[6] == 1){
                return true;
            }
        }
        if(checkForWin[2] == 1){
            if(checkForWin[4] == 1 && checkForWin[6] == 1){
                return true;
            }
            if(checkForWin[5] == 1 && checkForWin[8] == 1){
                return true;
            }
        }
        if(checkForWin[4] == 1){
            if(checkForWin[3] == 1 && checkForWin[5] == 1){
                return true;
            }
            if(checkForWin[1] == 1 && checkForWin[7] == 1){
                return true;
            }
        }
        if(checkForWin[6] == 1 && checkForWin[7] == 1 && checkForWin[8] == 1){
            return true;
        }

        return false;
    }

}
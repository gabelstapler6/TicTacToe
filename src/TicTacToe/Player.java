
package TicTacToe;

/**
 * Player
 */
public class Player {
    private int score;
    private String name;
    private boolean win = false;
    private int[] playerClicks = new int[9];
    
    public Player(String n) {
        this.name = n;
        this.score = 0;

    }

    public void setPlayerClicks(int n){
        playerClicks[n] = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incScore(int score) {
        this.score++;
    }

    public boolean getWin(){
        return win;
    }

    public void checkWin() {
        int win = 0, x = 0;
        for(int value = 0; value < 8; value++){
            for(int i = 0; i < 3; i++){
                switch(value){                          
                    case 0:
                    case 1:
                    case 2:
                    x = 3*i;
                    if(this.playerClicks[value+x] == 1)
                        win++;
                    break;
                    case 3:
                    if(this.playerClicks[i] == 1)
                        win++;
                    break;
                    case 4:
                    if(this.playerClicks[i+x] == 1)
                        win++;
                    break;
                    case 5:
                    x = 6;
                    if(this.playerClicks[i+x] == 1)
                        win++;
                    x = 0;
                    break;
                    case 6:
                    if(this.playerClicks[x] == 1)
                        win++;
                    x += 4;
                    break;
                    case 7:
                    x = (i+1)*2;
                    if(this.playerClicks[x] == 1)
                        win++;
                    break;
                }
            }
            if(win == 3){
                this.win = true;
            }
            win = 0;
        }
        this.win = false;
    }   
}
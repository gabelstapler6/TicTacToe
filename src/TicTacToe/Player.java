
package TicTacToe;

/**
 * Player
 */
public class Player {
    private int score;
    private String name;
    
    public Player(String n) {
        this.name = n;
        this.score = 0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void incScore(int score) {
        this.score++;
    }

   
}
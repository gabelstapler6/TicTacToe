package TicTacToe;


public class TicTacToe {
    private Player P1;
    private Player P2;

    public static void main(String[] args) {
        TTTView game = new TTTView();
        TTTModel model = new TTTModel();
        TTTController controller =  new TTTController(game, model);
    }
}


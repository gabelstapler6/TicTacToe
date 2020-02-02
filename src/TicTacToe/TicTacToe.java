package TicTacToe;


public class TicTacToe {
    private Player P1;
    private Player P2;

    public static void main(String[] args) {
        TTTView game = new TTTView();
        Model model = new Model();
        Controller controller =  new Controller(game, model);
    }
}


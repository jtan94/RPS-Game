public class Game {

    static Move yourMove;
    static Move opponentMove;

    public void playGame() {
	Player yourPlayer = new Player();
        Opponent yourOpponent = new Opponent();
	yourMove = yourPlayer.play();
	opponentMove = yourOpponent.play();
	System.out.println("You chose " + yourMove + " and your opponent chose " + opponentMove);
	if (yourMove == opponentMove) {
	    System.out.println("You both answered " + yourMove + " please try again!");
	} else if (yourMove == Move.ROCK && opponentMove == Move.SCISSORS) {
	    System.out.println("You won");
	} else if (yourMove == Move.ROCK && opponentMove == Move.PAPER) {
	    System.out.println("You lost");
	} else if (yourMove == Move.SCISSORS && opponentMove == Move.ROCK) {
	    System.out.println("You lost");
	} else if (yourMove == Move.SCISSORS && opponentMove == Move.PAPER) {
	    System.out.println("You won");
	} else if (yourMove == Move.PAPER && opponentMove == Move.ROCK) {
	    System.out.println("You won");
	} else if (yourMove == Move.PAPER && opponentMove == Move.SCISSORS) {
	    System.out.println("You lost");
	}
    }

    public static void main (String[] args) {
        Game myGame = new Game();
        myGame.playGame();
    }

    public enum Move {
	ROCK,
	PAPER,
	SCISSORS
    }
}

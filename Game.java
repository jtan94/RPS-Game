public class Game {

    private Outcome determineOutcome(Move humanMove, Move botMove) {
	 Outcome gameOutcome = Outcome.TIE;

	// only need to set cases where you win or lose
	if (humanMove == Move.ROCK) {
	    if (botMove == Move.SCISSORS) {
		gameOutcome = Outcome.WIN;
	    } else if (botMove == Move.PAPER) {
		gameOutcome = Outcome.LOSE;
	    }
	} else if (humanMove == Move.PAPER) {
	    if (botMove == Move.ROCK) {
		gameOutcome = Outcome.WIN;
	    } else if (botMove == Move.SCISSORS) {
		gameOutcome = Outcome.LOSE;
	    } 
	} else { // humanMove = Move.SCISSORS
	    if (botMove == Move.PAPER) {
		gameOutcome = Outcome.WIN;
	    } else if (botMove == Move.ROCK) {
		gameOutcome = Outcome.LOSE;
	    }
	}

	return gameOutcome;
    }

    public void playGame() {

	Player yourPlayer = new HumanPlayer();
        Player yourOpponent = new BotPlayer();

	Move yourMove = yourPlayer.makeMove();
	Move opponentMove = yourOpponent.makeMove();
	System.out.println("You chose " + yourMove + " and your opponent chose " + opponentMove);
	
	Outcome gameOutcome = determineOutcome(yourMove, opponentMove);
	switch (gameOutcome) {
	case WIN:
	    System.out.println("You won.");
	    break;
	case LOSE:
	    System.out.println("You lost.");
	    break;
	case TIE:
	    System.out.println("You tied.");
	    break;
	}
    }

    public static void main (String[] args) {
        Game myGame = new Game();
        myGame.playGame();
    }

    public enum Move {
	ROCK,
	PAPER,
	SCISSORS;

	public String toString() {
	    return this.name().charAt(0) + this.name().substring(1).toLowerCase();
	}
    }

    public enum Outcome {
	WIN,
	LOSE,
	TIE;
    }
}

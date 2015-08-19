import java.util.Scanner;

public class HumanPlayer implements Player {

    private Scanner in;

    public HumanPlayer() {
	in = new Scanner(System.in);
    }

    private String getPlayerInput() {
	System.out.println("Please enter : rock, paper, scissors");
	String input = in.nextLine();
	return input;
    }


    public Game.Move makeMove() {

	String userInput = getPlayerInput().toLowerCase().trim();
	Game.Move userMove = null;

	// TODO: check that input is valid and loop until it is

	switch (userInput) {

	case "r":
	case "rock":
	    userMove = Game.Move.ROCK;
	    break;
	case "p":
	case "paper":
	    userMove = Game.Move.PAPER;
	    break;
	case "s":
	case "scissors":
	    userMove = Game.Move.SCISSORS;
	    break;
	}
	    
	return userMove;
    }
}

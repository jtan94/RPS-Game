import java.util.Scanner;

public class HumanPlayer implements Player {

    String userInput;
    Game.Move userMove;
    String input;

    private Scanner in;

    private String getPlayerInput() {
	System.out.println("Please enter : rock, paper, scissors");
	in = new Scanner(System.in);
	input = in.nextLine();
	return input;
    }


    public Game.Move makeMove() {

	userInput = getPlayerInput();

	if (userInput.startsWith("r") || userInput.startsWith("R") ) {
	    userInput = "ROCK";
	    userMove = Game.Move.ROCK;
	} else if (userInput.startsWith("p") || userInput.startsWith("P")) {
	    userInput = "PAPER";
	    userMove = Game.Move.PAPER;
	} else if (userInput.startsWith("s") || userInput.startsWith("S")) {
	    userInput = "SCISSORS";
	    userMove = Game.Move.SCISSORS;
	} else {
	    System.out.println("Input doesn't make sense. Try again stupid.");
	}

	return userMove;
    }
}

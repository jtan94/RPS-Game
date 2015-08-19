import java.util.Scanner;

public class Player {

    String userInput;
    Move userMove;
    String input;

    private Scanner in;

    private String getPlayerInput() {
	System.out.println("Please enter : rock, paper, scissors");
	in = new Scanner(System.in);
	input = in.nextLine();
	return input;
    }

    public Move play() {

	userInput = getPlayerInput();

	if (userInput.startsWith("r") || userInput.startsWith("R") ) {
	    userInput = "ROCK";
	    userMove = Move.ROCK;
	} else if (userInput.startsWith("p") || userInput.startsWith("P")) {
	    userInput = "PAPER";
	    userMove = Move.PAPER;
	} else if (userInput.startsWith("s") || userInput.startsWith("S")) {
	    userInput = "SCISSORS";
	    userMove = Move.SCISSORS;
	} else {
	    System.out.println("Input doesn't make sense. Try again stupid.");
	}

	System.out.println("Your choice was  " + userInput);
	return userMove;
    }
}

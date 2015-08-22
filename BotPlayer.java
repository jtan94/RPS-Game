import java.util.Random;

public class BotPlayer implements Player{

    private Random rand;

    public BotPlayer() {
	rand = new Random();
    }

    public Game.Move makeMove() {
	Game.Move[] moves = Game.Move.values();
        return moves[rand.nextInt(moves.length)];
    }
}

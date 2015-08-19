import java.util.Random;

public class BotPlayer implements Player{

    public Game.Move makeMove() {
	Game.Move[] MoveValues = Game.Move.values();
        return MoveValues[(int)(Math.random()*MoveValues.length)];
    }

}

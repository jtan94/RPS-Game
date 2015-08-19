import java.util.Random;

public class Opponent {

    public Game.Move play() {
	Game.Move[] MoveValues = Game.Move.values();
        return MoveValues[(int)(Math.random()*MoveValues.length)];
    }

}

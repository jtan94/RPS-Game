import java.util.Random;
public class Opponent {
	public Move play() {
		Move[] MoveValues = Move.values();
        return MoveValues[(int)(Math.random()*MoveValues.length)];
    }
}

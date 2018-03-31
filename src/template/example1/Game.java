package template.example1;

/**
 * 
 * @author dagtekin
 *
 */
public abstract class Game {

	abstract void initGame();

	abstract void startGame();

	abstract void endGame();

	//Template Method
	public final void playGame() {
		initGame();
		startGame();
		endGame();
	}

}

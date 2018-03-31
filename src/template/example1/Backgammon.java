package template.example1;

/**
 * 
 * @author dagtekin
 *
 */
public class Backgammon  extends Game{
	
	@Override
	void initGame() {
		System.out.println("Backgammon is initializing");
		
	}

	@Override
	void startGame() {
		System.out.println("Backgammon game started");
		
	}

	@Override
	void endGame() {
		System.out.println("Backgammon game  is completed");
		
	}

}

package template.example1;

public class Chess extends Game {

	@Override
	void initGame() {
		System.out.println("Chess is initializing");
		
	}

	@Override
	void startGame() {
		System.out.println("Chess game started");
		
	}

	@Override
	void endGame() {
		System.out.println("Chess game  is completed");
		
	}

}

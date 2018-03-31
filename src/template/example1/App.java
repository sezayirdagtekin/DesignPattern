package template.example1;

/***
 * 
 * @author dagtekin
 *
 */
public class App {

	public static void main(String[] args) {

		Game chess = new Chess();
		chess.playGame();

		System.out.println("\n");
		Game backgammon = new Backgammon();
		backgammon.playGame();
	}

}

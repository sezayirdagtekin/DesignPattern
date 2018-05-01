package decorator.exampel1;

/**
 * 
 * @author dagtekin
 *
 */
public class App {

	public static void main(String[] args) {
		
		Sandwich sandwich= new MeatDecorator(new VeggieDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}

}

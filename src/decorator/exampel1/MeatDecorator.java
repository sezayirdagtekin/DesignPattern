package decorator.exampel1;

/**
 * 
 * @author dagtekin
 *
 */

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addMeat();
	}

	private String addMeat() {
		return " + chiken-bacon";
	}

}

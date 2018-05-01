package decorator.exampel1;

/**
 * 
 * @author dagtekin
 *
 */
public class VeggieDecorator extends SandwichDecorator {

	public VeggieDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + vegetables();
	}

	public String vegetables() {
		return "+ tomatoes-cucumber";
	}

}

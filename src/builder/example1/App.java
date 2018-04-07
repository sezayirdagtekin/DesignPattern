package builder.example1;

/**
 * 
 * @author dagtekin
 *
 */
public class App {

	public static void main(String[] args) {

		Person.Builder builder = new Person.Builder();
		builder.setName("John").setSurname("Hopkins").setAge(24).setEmail("john_hopkins@gmail.com");

		Person person = builder.build();
		System.out.println(person.getName() + " " + person.getSurname() + " " +
		person.getAge() + " " + person.getAge() + " " + person.getEmail());
	}

}

package adapter.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dagtekin
 *
 */
public class App {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new DBPerson(1, "Mark", "Twein"));
		list.add(new DBPerson(2, "John", "Steinbeck"));

		list.add(new LdapAdapeter(new LdapPerson(3, "Lev", "Tolstoy")));
		list.add(new LdapAdapeter(new LdapPerson(4, "Fyodor", "Dostoyeski")));

		System.out.println(list);

	}

}

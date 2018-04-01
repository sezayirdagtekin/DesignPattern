package adapter.example1;

/**
 * 
 * @author dagtekin
 *
 */

public class DBPerson  implements  Person{

	private int id;
	private String firstname;
	private String lastname;

	

	public DBPerson(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}



	@Override
	public int getId() {
	 return id;
	}



	@Override
	public String getName() {
		 return firstname;
	}



	@Override
	public String getSurname() {
		return lastname;
	}


	@Override
	public String toString() {
		return "Person { "+ this.getId()+" "+ this.getName() + " " + this.getSurname() + " }";
	}






}

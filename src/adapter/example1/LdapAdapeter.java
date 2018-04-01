package adapter.example1;

/**
 * 
 * @author dagtekin
 *
 */

public class LdapAdapeter implements Person {

	private LdapPerson istance;

	public LdapAdapeter(LdapPerson ldapPerson) {
		this.istance = ldapPerson;
	}

	@Override
	public int getId() {
		return istance.getCdn();
	}

	@Override
	public String getName() {
		return istance.getLdapusername();
	}

	@Override
	public String getSurname() {
		return istance.getLdapsurname();
	}

	
	

	@Override
	public String toString() {
		return "Person { "+ this.getId()+" "+ this.getName() + " " + this.getSurname() + " }";
	}
	
}

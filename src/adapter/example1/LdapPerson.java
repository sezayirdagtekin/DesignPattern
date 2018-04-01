package adapter.example1;

public class LdapPerson {

	private int cdn;
	private String ldapusername;
	private String ldapsurname;

	
	
	public LdapPerson(int cdn, String ldapusername, String ldapsurname) {

		this.cdn = cdn;
		this.ldapusername = ldapusername;
		this.ldapsurname = ldapsurname;
	}

	public int getCdn() {
		return cdn;
	}

	public void setCdn(int cdn) {
		this.cdn = cdn;
	}

	public String getLdapusername() {
		return ldapusername;
	}

	public void setLdapusername(String ldapusername) {
		this.ldapusername = ldapusername;
	}

	public String getLdapsurname() {
		return ldapsurname;
	}

	public void setLdapsurname(String ldapsurname) {
		this.ldapsurname = ldapsurname;

	}

}

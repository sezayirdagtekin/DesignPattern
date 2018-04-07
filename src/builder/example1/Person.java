package builder.example1;


/**
 * 
 * @author dagtekin
 *
 */

public class Person {

	private final String name;
	private final String surname;
	private final int age;
	private final String email;

	private Person(Builder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.age = builder.age;
		this.email = builder.email;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	static class Builder {

		private String name;
		private String surname;
		private int age;
		private String email;

		public Builder() {
			
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

}

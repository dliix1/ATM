package ATM;

public class User {

	private String name;
	private String lastName;
	private String telephoneNumber;
	private String address;

	User() {

	}

	public User(String name, String lastName, String telephoneNumber,
			String address) {
		this.name = name;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "User{" + "Name = '" + name + '\'' + ", last name = '"
				+ lastName + '\'' + ", address = '" + address + '\''
				+ ", phone number = '" + telephoneNumber + '\'' + '}';
	}
}

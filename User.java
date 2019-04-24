package ATM;

public class User {

	private String name;
	private String lastName;
	private String address;
	private int telephoneNumber;

	User(String name, String lastName) {

	}

	public User(String name, String lastName, int telephoneNumber,
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

	public int getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(int telephoneNumber) {
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

package staff;

public abstract class Staff {

	private String firstName;
	private String surname;
	private int ID;
	private double salary;

	public Staff(String firstName, String surname, int ID, double salary) {

		this.firstName = firstName;
		this.surname = surname;
		this.ID = ID;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	// returns the string representation of the object
	public String toString() {
		return (this.firstName + " " + this.surname);
	}
}
package tasks1;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id + firstName.length();
		result = prime * result + salary + lastName.length();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Employee employee = (Employee) obj;
		if ((this.firstName.equals(employee.getFirstName())) && (this.lastName.equals(employee.getLastName()))
				&& (this.id == employee.id) && (this.salary == employee.salary))
			return true;
		else
			return false;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		salary += salary * percent / 100;
		return salary;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
	}
}

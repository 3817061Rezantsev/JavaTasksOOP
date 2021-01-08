package hortsmannInterfaces;

public class Employee implements Measurable {
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

	@Override
	public double getMeasure() {
		return salary;
	}

	@Override
	public double average(Measurable[] objects) {
		double res = 0;
		for (int i = 0; i < objects.length; i++) {
			res += objects[i].getMeasure();
		}
		return res / objects.length;
	}

	public static void main(String args[]) {
		Measurable[] e = new Employee[5];
		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee(i, "A" + i, "B", 2 * i);
		}
		System.out.println(e[0].average(e));
		System.out.println(((Employee) e[0].largest(e)).getName());
	}

	@Override
	public Measurable largest(Measurable[] objects) {
		double max = objects[0].getMeasure();
		int index = 0;
		for (int i = 1; i < objects.length; i++) {
			if (max < objects[i].getMeasure()) {
				max = objects[i].getMeasure();
				index = i;
			}
		}
		return objects[index];
	}
}
// Why do you need a cast? Для того чтобы вызвать метод класса Employee, так как у интерфейса Measurable 
// нет метода getName(). 

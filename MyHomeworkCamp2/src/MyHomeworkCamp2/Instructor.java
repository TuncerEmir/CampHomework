package MyHomeworkCamp2;

public class Instructor extends User {
	
	int salary;
	
	public Instructor(String firstName, String lastName, String email, int salary) {
		super(firstName, lastName, email);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

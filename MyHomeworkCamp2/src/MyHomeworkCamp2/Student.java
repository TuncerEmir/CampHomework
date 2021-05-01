package MyHomeworkCamp2;

public class Student extends User {

	String studentNumber;	

	public Student(String firstName, String lastName, String email, String studentNumber) {
		
		super(firstName, lastName, email);
		
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}

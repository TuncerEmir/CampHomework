package MyHomeworkCamp2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Engin","Demiroğu","instructorMail@mail.com",5000);		
		Student student = new Student("Emir","Tuncer","studentMail@mail.com","12301");
		
		
		UserManager userManager = new UserManager();		
		InstructorManager instructorManager = new InstructorManager();		
		StudentManager studentManager = new StudentManager();
		
		userManager.login(student);
		userManager.login(instructor);

		userManager.logout(student);
		userManager.logout(instructor);
		
		instructorManager.createCourse(instructor);
		studentManager.takeCouse(student);
	}

}

package MyHomeworkCamp;

public class Main {

	public static void main(String[] args) {						
		
		Course course1 = new Course(1, "Java + React", "Engin Demiroğ", 50);
		Course course2 = new Course(2, "C# + Angular", "Engin Demiroğ", 75);
		Course course3 = new Course(3, "Java temel seviye", "Mustafa Murat Coşkun", 100);
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.id+" / "+course.name+" / "+course.instructor+" / "+course.completionRate);
		}
		
		System.out.println("--------------------");
		
		User user1 = new User(10,"Emir Tuncer",20,"Erkek");
		User user2 = new User(20,"Mert Şahin",21,"Erkek");
		User user3 = new User(30,"Fatoş Tunç",20,"Kadın");
		
		User[] users = {user1,user2,user3};
		
		for (User user : users) {
			System.out.println(user.id+" / "+user.name+" / "+user.age+" / "+user.gender);
		}
		
		System.out.println("--------------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.courseJoin(course1);
		courseManager.courseJoin(course2);
		courseManager.courseJoin(course3);
		System.out.println("--------------------");
		courseManager.courseUpdate(course1);
		courseManager.courseUpdate(course2);
		courseManager.courseUpdate(course3);
		
		System.out.println("--------------------");
		
		UserManager userManager = new UserManager();
		userManager.userAdd(user1);
		userManager.userAdd(user2);
		userManager.userAdd(user3);
		System.out.println("--------------------");
		userManager.userUpdate(user1);
		userManager.userUpdate(user2);
		userManager.userUpdate(user3);
		System.out.println("--------------------");
		userManager.userDelete(user1);
		userManager.userDelete(user2);
		userManager.userDelete(user3);
	}

}

package MyHomeworkCamp;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println(user.name+" adl� kullan�c� eklendi.");
	}
	
	public void userDelete(User user) {
		System.out.println(user.name+" adl� kullan�c� silindi.");
	}
	
	public void userUpdate(User user) {
		System.out.println(user.name+" adl� kullan�c� g�ncellendi.");
	}

}

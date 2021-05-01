package MyHomeworkCamp2;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " giriþ yaptý.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " çýkýþ yaptý.");
	}

}

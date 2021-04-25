package MyHomeworkCamp;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println(user.name+" adlý kullanýcý eklendi.");
	}
	
	public void userDelete(User user) {
		System.out.println(user.name+" adlý kullanýcý silindi.");
	}
	
	public void userUpdate(User user) {
		System.out.println(user.name+" adlý kullanýcý güncellendi.");
	}

}

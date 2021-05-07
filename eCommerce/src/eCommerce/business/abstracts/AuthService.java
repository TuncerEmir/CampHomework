package eCommerce.business.abstracts;


import eCommerce.entities.concretes.LoginDto;
//Giri� ve kay�t olma i�lemleri
import eCommerce.entities.concretes.User;

public interface AuthService {
	void register(User user);
	//do�rulama
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}

package eCommerce.business.abstracts;


import eCommerce.entities.concretes.LoginDto;
//Giriþ ve kayýt olma iþlemleri
import eCommerce.entities.concretes.User;

public interface AuthService {
	void register(User user);
	//doðrulama
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}

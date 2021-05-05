package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean playerCheck(Player player) {
		if (player.getIdentityNumber().length()==11) {
			
			System.out.println("Kimlik doğrulama başarılı.");
			return true;
		} else {
					System.out.println("Kimlik doğrulanamadı.");
		return false;
		}

	}
	
	

}

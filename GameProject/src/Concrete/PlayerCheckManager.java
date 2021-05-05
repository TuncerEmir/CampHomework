package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean playerCheck(Player player) {
		if (player.getIdentityNumber().length()==11) {
			
			System.out.println("Kimlik doðrulama baþarýlý.");
			return true;
		} else {
					System.out.println("Kimlik doðrulanamadý.");
		return false;
		}

	}
	
	

}

package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	private PlayerCheckManager playerCheckManager;

	public PlayerManager(PlayerCheckManager playerCheckManager) {
		this.playerCheckManager = playerCheckManager;
	}

	@Override
	public void register(Player player) {
		System.out.println(player.getFirstName()+" isimli kullanýcý sisteme kayýt oldu.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+" isimli kullanýcý bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" isimli kullanýcý sistemden silindi.");
		
	}

}

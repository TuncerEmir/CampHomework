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
		System.out.println(player.getFirstName()+" isimli kullan�c� sisteme kay�t oldu.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+" isimli kullan�c� bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" isimli kullan�c� sistemden silindi.");
		
	}

}

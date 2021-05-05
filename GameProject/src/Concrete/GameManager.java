package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService{

	@Override
	public void get(Game game, Player player) {
		System.out.println(player.getFirstName()+" isimli kullan�c� "+game.getGameName()+" isimli oyunu ba�ar�yla ald�.");
		
	}

	@Override
	public void delete(Game game, Player player) {
		System.out.println(player.getFirstName()+" isimli kullan�c� "+game.getGameName()+" isimli oyunu ba�ar�yla sildi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" isimli oyun ba�ar�yla g�ncellendi.");
		
	}

}

package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService{

	@Override
	public void get(Game game, Player player) {
		System.out.println(player.getFirstName()+" isimli kullanýcý "+game.getGameName()+" isimli oyunu baþarýyla aldý.");
		
	}

	@Override
	public void delete(Game game, Player player) {
		System.out.println(player.getFirstName()+" isimli kullanýcý "+game.getGameName()+" isimli oyunu baþarýyla sildi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" isimli oyun baþarýyla güncellendi.");
		
	}

}

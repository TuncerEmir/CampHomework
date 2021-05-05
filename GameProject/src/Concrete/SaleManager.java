package Concrete;

import Abstract.SaleService;
import Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void sellOfGame(Game game) {
		System.out.println(game.getGameName()+" isimli oyun "+game.getPrice()+"TL'ye satýn alýndý.");
		
	}

}

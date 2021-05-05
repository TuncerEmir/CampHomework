import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		Player player1 = new Player(10010,"01.01.1995","Emir","TUNCER","10000000001");
		Player player2 = new Player(10011,"02.02.1996","Mahmut","KILIÇ","10000000002");
		
		playerManager.register(player1);
		playerManager.update(player2);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1010,"Yaz'a giriþ","%50");
		
		campaignManager.add(campaign1);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(10101,"Age Of Empires",31.50);
		
		Game game2 = new Game(10102,"Metin2",1.50);
		
		gameManager.get(game1, player1);
		gameManager.delete(game2, player2);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sellOfGame(game1);
		saleManager.sellOfGame(game2);
	}

}

package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{


	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� ba�lad�.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� bitti.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyas� yenilendi.");
		
	}

}

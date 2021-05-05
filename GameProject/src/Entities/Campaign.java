package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private String campaignDiscount;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, String campaignDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(String campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

}

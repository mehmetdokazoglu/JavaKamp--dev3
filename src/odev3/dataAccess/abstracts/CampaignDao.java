package odev3.dataAccess.abstracts;

import odev3.entitites.concretes.Campaign;

public interface CampaignDao {

	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	
}

package odev3.dataAccess.concretes;

import odev3.dataAccess.abstracts.CampaignDao;
import odev3.entitites.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Hibernate ile eklendi: " + campaign.getName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getName());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi: " + campaign.getName());

	}

}

package odev3.business.concretes;

import odev3.business.abstracts.CampaignService;
import odev3.dataAccess.abstracts.CampaignDao;
import odev3.entitites.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private CampaignDao campaignDao;

	public CampaignManager(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		if (campaign.getName().isEmpty() && campaign.getPrice() <= 0) {
			System.out.println("Kampanya bilgilerini giriniz!!");
		}
		this.campaignDao.add(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		if (campaign.getName().isEmpty()) {
			System.out.println("Silmek istediğiniz kampanya adını giriniz");

		} else {
			System.out.println("Kampanya silindi: " + campaign.getName());
		}

	}

	@Override
	public void update(Campaign campaign) {
		if (campaign.getName().isEmpty()) {
			System.out.println("Güncellemek istediğiniz kampanya adını giriniz");

		} else {
			System.out.println("Kampanya güncellendi: " + campaign.getName());
		}

	}

}

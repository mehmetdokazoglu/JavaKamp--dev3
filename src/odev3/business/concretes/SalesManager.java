package odev3.business.concretes;

import odev3.business.abstracts.SalesService;
import odev3.entitites.concretes.Campaign;
import odev3.entitites.concretes.Sales;
import odev3.entitites.concretes.User;

public class SalesManager implements SalesService {

	@Override
	public void sale(Sales sales, User user, Campaign campaign) {
		System.out.println("Satın alma işlemi başarılı: " + sales.getName() + campaign.getName()
				+ "kampanyası uygulandı: " + " İndirimli fiyat: " + campaign.getPriceAfterDiscount() + " "
				+ " Satın alan: " + user.getFirstName() + " " + user.getLastName());
	}

}

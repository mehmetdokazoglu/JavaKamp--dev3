package odev3.business.abstracts;

import odev3.entitites.concretes.Campaign;
import odev3.entitites.concretes.Sales;
import odev3.entitites.concretes.User;

public interface SalesService {

	void sale(Sales sales, User user, Campaign campaign);
}

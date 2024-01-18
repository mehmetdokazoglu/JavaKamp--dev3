package odev3;



import odev3.business.abstracts.CampaignService;
import odev3.business.abstracts.GamerService;
import odev3.business.abstracts.SalesService;
import odev3.business.abstracts.UserService;
import odev3.business.concretes.CampaignManager;
import odev3.business.concretes.GamerManager;
import odev3.business.concretes.SalesManager;
import odev3.business.concretes.UserManager;
import odev3.dataAccess.concretes.HibernateCampaignDao;
import odev3.dataAccess.concretes.HibernateGamerDao;
import odev3.dataAccess.concretes.HibernateUserDao;
import odev3.entitites.concretes.Campaign;
import odev3.entitites.concretes.Gamer;
import odev3.entitites.concretes.Sales;
import odev3.entitites.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1= new User(1,"Mehmet","Dokazoğlu","12345678910","1998-07-10");
		
		
		Gamer gamer= new Gamer(5,"Call Of Duty",599);
		
		Campaign campaign1= new Campaign();
		campaign1.setId(4);
		campaign1.setName("'Yaz İndirimi' ");
		campaign1.setPrice(400);
		campaign1.setDiscount(10);
		
		Sales sales1= new Sales();
		sales1.setId(7);
		sales1.setName("Oyun Satışı yapıldı: ");
		
		
		
		UserService userService= new UserManager(new HibernateUserDao());
		userService.add(user1);
		
		GamerService gamerService= new GamerManager(new HibernateGamerDao());
		gamerService.add(gamer);
		
		CampaignService campaignService= new CampaignManager(new HibernateCampaignDao());
		campaignService.add(campaign1);
		
		SalesService salesService= new SalesManager();
		salesService.sale(sales1, user1, campaign1);
		
		
		
		
		
		
		
	
	}

}

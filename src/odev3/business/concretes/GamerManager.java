package odev3.business.concretes;

import odev3.business.abstracts.GamerService;

import odev3.dataAccess.abstracts.GamerDao;
import odev3.entitites.concretes.Gamer;


public class GamerManager implements GamerService {

	private GamerDao gamerDao;
	
	

	public GamerManager(GamerDao gamerDao) {
		this.gamerDao = gamerDao;
		

	}

	@Override
	public void add(Gamer gamer) {
		if (gamer.getName() == null && gamer.getUnitPrice() <= 0) {
			System.out.println("Ürün eklenemedi!!!");
		}
		this.gamerDao.add(gamer);
		
	}
	
	@Override
	public void delete(Gamer gamer) {
		if (gamer.getName().isEmpty()) {
			System.out.println("Silmek istediğiniz oyunun adını giriniz!!");
		} else {
			System.out.println("Oyun silindi: " + gamer.getName());
		}
		
	}

	
	@Override
	public void update(Gamer gamer) {
		if (gamer.getName().isEmpty()) {
			System.out.println("Güncellemek istediğiniz oyunun adını giriniz!!");
		} else {
			System.out.println("Oyun silindi: " + gamer.getName());
		}

	}

	

}

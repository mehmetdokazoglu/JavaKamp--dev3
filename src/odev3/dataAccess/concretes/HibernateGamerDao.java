package odev3.dataAccess.concretes;

import java.util.List;

import odev3.dataAccess.abstracts.GamerDao;
import odev3.entitites.concretes.Gamer;


public class HibernateGamerDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Hibernate ile oyun eklendi: " + gamer.getName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyun sistemden silindi: " + gamer.getName());

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyun bilgileri güncellendi: " + gamer.getName());

	}

	@Override
	public Gamer get(int id) {
		System.out.println(id + "Oyun getirildi");
		return null;
	}

	@Override
	public List<Gamer> getAll() {
		System.out.println("Oyunlar listelendi");
		return null;
	}



}

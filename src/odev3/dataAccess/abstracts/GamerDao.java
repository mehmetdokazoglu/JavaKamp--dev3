package odev3.dataAccess.abstracts;

import java.util.List;

import odev3.entitites.concretes.Gamer;


public interface GamerDao {

	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	Gamer get(int id);
	List<Gamer> getAll();
}

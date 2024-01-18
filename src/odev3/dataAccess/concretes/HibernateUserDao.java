package odev3.dataAccess.concretes;

import odev3.dataAccess.abstracts.UserDao;
import odev3.entitites.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile kaydedildi: " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.getFirstName() + " " + user.getLastName());

	}

}

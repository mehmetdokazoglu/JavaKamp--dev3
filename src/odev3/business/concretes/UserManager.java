package odev3.business.concretes;

import odev3.business.abstracts.UserService;
import odev3.core.UserCheckManager;
import odev3.dataAccess.abstracts.UserDao;
import odev3.entitites.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if (UserCheckManager.userCheck(user)) {
			this.userDao.add(user);
		} else {
			System.out.println("Kullanıcı eklenemedi!!");
		}

	}

	@Override
	public void delete(User user) {
		if (UserCheckManager.userCheck(user)) {
			System.out.println("Kullanıcı silindi: " + user.getFirstName() + " " + user.getLastName());
		} else {
			System.out.println("Kullanıcı silinemedi!!");
		}
	}

	@Override
	public void update(User user) {
		if (UserCheckManager.userCheck(user)) {
			System.out.println("Kullanıcı bilgileri güncellendi: " + user.getFirstName() + " " + user.getLastName());
		} else {
			System.out.println("Kullanıcı bilgileri güncellenemedi!!");
		}

	}

}

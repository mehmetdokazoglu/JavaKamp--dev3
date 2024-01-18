package odev3.dataAccess.abstracts;

import odev3.entitites.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
		
	
}

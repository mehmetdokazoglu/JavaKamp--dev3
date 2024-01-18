package odev3.business.abstracts;



import odev3.entitites.concretes.User;

public interface UserService {

	void add(User user);
	void delete(User user);
	void update(User user);

}

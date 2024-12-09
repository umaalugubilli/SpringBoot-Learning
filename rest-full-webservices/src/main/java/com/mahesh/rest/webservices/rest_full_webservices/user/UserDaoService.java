package com.mahesh.rest.webservices.rest_full_webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	static {
		users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Eve",LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"Noah",LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> Predicate = user -> user.getId().equals(id) ;
		return users.stream().filter(Predicate).findFirst().orElse(null);
	}

	public User save(User user) {
		// TODO Auto-generated method stub
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super User> Predicate = user -> user.getId().equals(id) ;
		 users.removeIf(Predicate);

	}

}

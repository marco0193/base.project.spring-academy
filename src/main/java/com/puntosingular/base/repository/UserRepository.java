package com.puntosingular.base.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.puntosingular.base.models.User;

public interface UserRepository extends CrudRepository<User,Long>{

	public User findByName(String name);
	
	@Query("SELECT user FROM User user WHERE user.name=?1")
	public User getUserByName(String name);
}
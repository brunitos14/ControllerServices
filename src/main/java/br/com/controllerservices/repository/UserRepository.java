package br.com.controllerservices.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.controllerservices.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByEmail(String email);
	
	

	
	
}

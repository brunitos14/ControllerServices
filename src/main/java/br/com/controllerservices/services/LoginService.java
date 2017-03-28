package br.com.controllerservices.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.controllerservices.models.Rule;
import br.com.controllerservices.models.Tutorial;
import br.com.controllerservices.models.User;

@Service
public class LoginService {

private final List<Tutorial> tutorials = new ArrayList<>();

private final User users = new User("teste","teste", 0, new ArrayList<Rule>());

	@PostConstruct
	public void init() {
		tutorials.add(new Tutorial(1l, "Tutorial1", "Tutorial 1 Description", 1l, 1l));
	}

	public User getUser(String user){
		return users;
	}

}

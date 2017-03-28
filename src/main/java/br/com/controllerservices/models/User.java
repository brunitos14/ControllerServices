package br.com.controllerservices.models;

import java.util.List;


public class User{


	public User(String name, String password, Integer status, List<Rule> rules) {
		super();
		this.name = name;
		this.password = password;
		this.status = status;
		this.rules = rules;
	}

	public User() {
	}

	private String name;

	private String password;

    private Integer status;
    
    private List<Rule> rules;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}




}

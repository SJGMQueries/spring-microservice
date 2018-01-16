package com.spring.microservice.demo.api;

public class User {
	private int id;
	private String name;
	private String profession;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public User(int id, String name, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

}

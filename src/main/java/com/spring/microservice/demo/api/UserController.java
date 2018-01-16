package com.spring.microservice.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	public static List<User> users = new ArrayList<>();

	static {

		for (int i = 1; i <= 5; i++) {
			users.add(new User(i, "name" + i, "profession" + i));
		}
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return users;
	}

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		users.add(user);
		return "user added with ID :" + user.getId();
	}
}

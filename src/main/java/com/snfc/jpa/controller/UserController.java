package com.snfc.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snfc.jpa.entity.Group;
import com.snfc.jpa.entity.User;
import com.snfc.jpa.service.UserRepositary;

@RestController
@RequestMapping("/jpa/user")
public class UserController {
	
	@Autowired
	private UserRepositary repositary;
	
	@GetMapping(path="/add")
	public String createUser() {
		List<Group> groups = new ArrayList<>();
		Group group = new Group("Admin Group");
		//group.setId(1);
		groups.add(group);
		repositary.save(new User("Nisal", "Admin", groups));
		return "inserted!";
		
	}

}

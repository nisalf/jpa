package com.snfc.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snfc.jpa.entity.Group;
import com.snfc.jpa.entity.User;
import com.snfc.jpa.service.GroupRepositary;

@RestController
@RequestMapping("/jpa/group")
public class GroupController {
	
	@Autowired
	private GroupRepositary repositary;
	
	@GetMapping(path="/add")
	public String createGroup() {
		List<User> users = new ArrayList<>();
		repositary.save(new Group("Admin Group", users));
		return "inserted!";
		
	}

}

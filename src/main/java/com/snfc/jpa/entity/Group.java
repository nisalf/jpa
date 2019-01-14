package com.snfc.jpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ad_group")
public class Group {
	private long id;
	private String groupName;
	List<User> users;
	
	public Group() {
		
	}
	public Group(String groupName) {
		this.groupName = groupName;
	}
	
	public Group(String groupName, List<User> users) {
		super();
		this.groupName = groupName;
		this.users = users;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", groupName=" + groupName + "]";
	}
	@ManyToMany(mappedBy = "groups")
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
	

}

package com.snfc.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snfc.jpa.entity.Group;
public interface GroupRepositary extends JpaRepository<Group, Long>{

}

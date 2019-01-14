package com.snfc.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snfc.jpa.entity.User;
public interface UserRepositary extends JpaRepository<User, Long>{

}

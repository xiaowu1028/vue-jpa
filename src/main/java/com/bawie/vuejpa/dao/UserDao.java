package com.bawie.vuejpa.dao;

import com.bawie.vuejpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {



}

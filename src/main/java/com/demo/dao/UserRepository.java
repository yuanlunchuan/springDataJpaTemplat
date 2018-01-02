package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {

}

package com.hohuunhan.SpringCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hohuunhan.SpringCRUD.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

	Boolean existsByEmail(String email);
	
}

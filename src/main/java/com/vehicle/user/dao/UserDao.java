package com.vehicle.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.User;

@Repository("userRepository")
public interface UserDao extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}

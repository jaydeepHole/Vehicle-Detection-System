package com.vehicle.service;

import com.vehicle.entity.User;

public interface UserService {

	public User findByEmail(String email);

	public void addUser(User user);

}

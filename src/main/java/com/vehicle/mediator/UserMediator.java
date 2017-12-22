package com.vehicle.mediator;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.vehicle.entity.Role;
import com.vehicle.entity.User;
import com.vehicle.role.service.RoleService;
import com.vehicle.service.UserService;

@Component
public class UserMediator {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	public User addUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(1);
		Role userRole = roleService.findByRole("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userService.addUser(user);
		return user;
	}

}

package com.vehicle.role.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.entity.Role;
import com.vehicle.role.dao.RoleDao;
import com.vehicle.role.service.RoleService;

@Service
public class RoleServiceImple implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public Role findByRole(String role) {
		// TODO Auto-generated method stub
		return roleDao.findByRole(role);
	}
}

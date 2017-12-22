package com.vehicle.role.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.Role;

@Repository("roleRepository")
public interface RoleDao extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);
}

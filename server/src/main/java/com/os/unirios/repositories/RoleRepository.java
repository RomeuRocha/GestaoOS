package com.os.unirios.repositories;

import java.util.Optional;

import com.os.unirios.entities.ERole;
import com.os.unirios.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}

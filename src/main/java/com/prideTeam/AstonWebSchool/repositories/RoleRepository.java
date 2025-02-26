package com.prideTeam.AstonWebSchool.repositories;

import com.prideTeam.AstonWebSchool.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String role);
}

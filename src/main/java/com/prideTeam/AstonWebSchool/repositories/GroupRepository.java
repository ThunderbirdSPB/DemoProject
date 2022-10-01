package com.prideTeam.AstonWebSchool.repositories;

import com.prideTeam.AstonWebSchool.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group,Integer> {
}

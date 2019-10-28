package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    Group findById(long id);
}

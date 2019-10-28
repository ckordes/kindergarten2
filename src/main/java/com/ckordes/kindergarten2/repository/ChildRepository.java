package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child,Long> {
    Child findById(long id);
}

package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Long> {
    Parent findById(long id);
}

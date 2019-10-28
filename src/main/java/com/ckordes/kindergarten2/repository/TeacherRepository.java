package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findById(long id);
}

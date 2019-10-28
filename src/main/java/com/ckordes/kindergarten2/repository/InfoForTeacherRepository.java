package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.InfoForTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoForTeacherRepository extends JpaRepository<InfoForTeacher,Long> {
    InfoForTeacher findById(long id);
}

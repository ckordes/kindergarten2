package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long> {
    Phone findById(long id);
}

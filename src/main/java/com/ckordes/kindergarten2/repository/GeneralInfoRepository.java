package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.GeneralInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralInfoRepository extends JpaRepository<GeneralInfo,Long> {
    GeneralInfo findById(long id);
}

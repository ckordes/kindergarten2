package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.GroupInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupInfoRepository extends JpaRepository<GroupInfo,Long> {
    GroupInfo findById(long id);
}

package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.ChildRelatedMessages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRelatedMessagesRepository extends JpaRepository<ChildRelatedMessages, Long> {
    ChildRelatedMessages findById(long id);
}

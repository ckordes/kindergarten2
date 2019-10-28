package com.ckordes.kindergarten2.repository;

import com.ckordes.kindergarten2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository <Address,Long>{
    Address findById(long id);
}

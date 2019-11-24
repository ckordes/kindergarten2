package com.ckordes.kindergarten2.service;

import com.ckordes.kindergarten2.entity.Person;

public interface UserService {
        Person findPersonByEmail(String email);
        void saveUser(Person person);
    }

package com.ckordes.kindergarten2.controler;

import com.ckordes.kindergarten2.entity.Address;
import com.ckordes.kindergarten2.entity.Person;
import com.ckordes.kindergarten2.repository.AddressRepository;
import com.ckordes.kindergarten2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {

        return "/login";
    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logout() {

        return "/";
    }
        //one time event to create a user 'admin user'
    @GetMapping("/createuser")
    @ResponseBody
    public String createUser() {
        Person person = new Person();
        Address address = new Address();
        address.setCity("CityAdmin");
        address.setHomeWork(true);
        addressRepository.save(address);

        person.setEmail("admin@admin.com");
        person.setPassword("admin");
        person.setFirstName("Admin");
        person.setLastName("Admin");
        person.setIdNumber("123");
        person.setPesel("62100196223");
        person.setHomeAddress(address);
        personRepository.save(person);
        return "admin";
    }
}
